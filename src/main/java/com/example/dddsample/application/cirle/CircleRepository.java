package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.model.circle.Circle;
import com.example.dddsample.domain.model.circle.CircleId;
import com.example.dddsample.domain.model.circle.CircleName;

public interface CircleRepository {

	void save(Circle circle);

	Circle find(CircleId circleId);

	Circle find(CircleName circleName);
}
