package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.circle.Circle;
import com.example.dddsample.domain.circle.CircleName;
import com.example.dddsample.domain.user.User;

public interface CircleFactory {

	Circle create(CircleName name, User owner);
}
