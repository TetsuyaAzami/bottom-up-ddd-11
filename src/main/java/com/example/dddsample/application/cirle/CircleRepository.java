package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.circle.Circle;
import com.example.dddsample.domain.circle.CircleId;
import com.example.dddsample.domain.circle.CircleName;

public interface CircleRepository {

	void save(Circle circle);

	Circle find(CircleId circleId);

	Circle find(CircleName circleName);
}
