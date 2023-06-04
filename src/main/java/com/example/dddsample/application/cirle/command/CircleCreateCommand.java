package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.circle.CircleName;
import com.example.dddsample.domain.user.UserId;

public record CircleCreateCommand(UserId userId, CircleName circleName){};
