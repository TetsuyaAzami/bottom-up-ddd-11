package com.example.dddsample.domain;

public record UserId(Integer value) {

	public UserId {
		if (value == null)
			throw new NullPointerException();
	}
}
