package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.Circle;
import com.example.dddsample.domain.CircleId;
import com.example.dddsample.domain.CircleName;

public interface CircleRepository {

	void save(Circle circle);

	Circle find(CircleId circleId);

	Circle find(CircleName circleName);
}
