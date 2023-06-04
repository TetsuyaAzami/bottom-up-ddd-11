package com.example.dddsample.domain.service;

import org.springframework.stereotype.Service;
import com.example.dddsample.application.cirle.CircleRepository;
import com.example.dddsample.domain.model.circle.Circle;

@Service
public class CircleDupulicateCheckService {

	private CircleRepository circleRepository;

	public CircleDupulicateCheckService(CircleRepository circleRepository) {
		this.circleRepository = circleRepository;
	}

	public boolean isDupulicated(Circle circle) {
		Circle dupulicated = circleRepository.find(circle.name());

		return dupulicated != null;
	}
}
