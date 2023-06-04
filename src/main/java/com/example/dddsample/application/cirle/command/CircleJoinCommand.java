package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.circle.CircleId;
import com.example.dddsample.domain.user.UserId;

public record CircleJoinCommand(CircleId circleId, UserId userId) {
}
