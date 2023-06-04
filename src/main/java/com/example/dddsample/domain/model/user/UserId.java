package com.example.dddsample.domain.model.user;

public record UserId(Integer value) {

	public UserId {
		if (value == null)
			throw new NullPointerException();
	}
}
