package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.CircleName;
import com.example.dddsample.domain.UserId;

public record CircleCreateCommand(UserId userId, CircleName circleName){};
