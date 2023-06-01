package com.example.dddsample.application.cirle;

import com.example.dddsample.domain.CircleName;
import com.example.dddsample.domain.UserId;

public record CircleCreateCommand(UserId userId, CircleName circleName){};
