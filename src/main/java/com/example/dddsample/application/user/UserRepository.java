package com.example.dddsample.application.user;

import com.example.dddsample.domain.User;
import com.example.dddsample.domain.UserId;

public interface UserRepository {

	public User find(UserId userId);
}
