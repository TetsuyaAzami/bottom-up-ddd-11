package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.model.circle.Circle;
import com.example.dddsample.domain.model.circle.CircleName;
import com.example.dddsample.domain.model.user.User;

public interface CircleFactory {

	Circle create(CircleName name, User owner);
}
