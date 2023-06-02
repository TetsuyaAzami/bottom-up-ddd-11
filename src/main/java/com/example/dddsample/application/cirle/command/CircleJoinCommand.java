package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.CircleId;
import com.example.dddsample.domain.UserId;

public record CircleJoinCommand(CircleId circleId, UserId userId) {
}
