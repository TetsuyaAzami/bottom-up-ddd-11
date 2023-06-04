package com.example.dddsample.application.cirle.command;

import com.example.dddsample.domain.model.circle.CircleId;
import com.example.dddsample.domain.model.user.UserId;

public record CircleJoinCommand(CircleId circleId, UserId userId) {
}
