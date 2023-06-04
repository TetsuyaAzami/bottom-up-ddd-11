package com.example.dddsample.application.cirle;

import org.springframework.transaction.annotation.Transactional;
import com.example.dddsample.application.cirle.command.CircleCreateCommand;
import com.example.dddsample.application.cirle.command.CircleJoinCommand;
import com.example.dddsample.application.user.UserRepository;
import com.example.dddsample.domain.model.circle.Circle;
import com.example.dddsample.domain.model.user.User;
import com.example.dddsample.domain.service.CircleDupulicateCheckService;
import com.example.dddsample.exception.circle.CannotRegisterCircleException;
import com.example.dddsample.exception.circle.CircleCapacityOverException;
import com.example.dddsample.exception.circle.CircleNotFoundException;
import com.example.dddsample.exception.user.UserNotFoundException;

public class CircleApplicationService {

	private CircleFactory circleFactory;

	private CircleRepository circleRepository;

	private CircleDupulicateCheckService circleDupulicateCheckService;

	private UserRepository userRepository;

	public CircleApplicationService(CircleFactory circleFactory, CircleRepository circleRepository,
			CircleDupulicateCheckService circleService, UserRepository userRepository) {
		this.circleFactory = circleFactory;
		this.circleRepository = circleRepository;
		this.circleDupulicateCheckService = circleService;
		this.userRepository = userRepository;
	}

	@Transactional
	public void register(CircleCreateCommand circleCreateCommand) {
		User owner = this.userRepository.find(circleCreateCommand.userId());
		if (owner == null)
			throw new UserNotFoundException();

		Circle circle = this.circleFactory.create(circleCreateCommand.circleName(), owner);
		if (this.circleDupulicateCheckService.isDupulicated(circle))
			throw new CannotRegisterCircleException();

		this.circleRepository.save(circle);
	}

	@Transactional
	public void join(CircleJoinCommand circleJoinCommand){
		User joiner = this.userRepository.find(circleJoinCommand.userId());
		if (joiner == null) throw new UserNotFoundException();

		Circle circle = this.circleRepository.find(circleJoinCommand.circleId());
		if(circle == null) throw new CircleNotFoundException();
		if(!circle.isNewMemberJoinable()) throw new CircleCapacityOverException();

		Circle circleWithNewMembers = circle.join(joiner.id());

		this.circleRepository.save(circleWithNewMembers);
	}
}
