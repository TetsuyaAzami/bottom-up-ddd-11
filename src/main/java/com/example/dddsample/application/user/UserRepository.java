package com.example.dddsample.application.user;

import com.example.dddsample.domain.user.User;
import com.example.dddsample.domain.user.UserId;

public interface UserRepository {

	public User find(UserId userId);
}
