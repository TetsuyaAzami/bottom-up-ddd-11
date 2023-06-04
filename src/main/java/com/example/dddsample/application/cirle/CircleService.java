package com.example.dddsample.application.cirle;

import org.springframework.stereotype.Service;
import com.example.dddsample.domain.circle.Circle;

@Service
public class CircleService {

	private CircleRepository circleRepository;

	public CircleService(CircleRepository circleRepository) {
		this.circleRepository = circleRepository;
	}

	public boolean exists(Circle circle) {
		Circle dupulicated = circleRepository.find(circle.name());

		return dupulicated != null;
	}
}
