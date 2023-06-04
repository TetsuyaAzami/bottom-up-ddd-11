package com.example.dddsample.domain.user;

public record UserId(Integer value) {

	public UserId {
		if (value == null)
			throw new NullPointerException();
	}
}
