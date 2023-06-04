package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.model.circle.CircleName;
import com.example.dddsample.domain.model.user.UserId;

public record CircleCreateCommand(UserId userId, CircleName circleName){};
