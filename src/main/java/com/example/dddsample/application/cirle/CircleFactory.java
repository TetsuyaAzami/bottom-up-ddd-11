package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.Circle;
import com.example.dddsample.domain.CircleName;
import com.example.dddsample.domain.User;

public interface CircleFactory {

	Circle create(CircleName name, User owner);
}
