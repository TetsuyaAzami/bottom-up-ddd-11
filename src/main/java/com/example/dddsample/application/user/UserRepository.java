package com.example.dddsample.application.user;

import com.example.dddsample.domain.model.user.User;
import com.example.dddsample.domain.model.user.UserId;

public interface UserRepository {

	public User find(UserId userId);
}
