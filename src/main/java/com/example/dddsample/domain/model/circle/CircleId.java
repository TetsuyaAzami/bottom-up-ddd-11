package com.example.dddsample.domain.model.circle;

public record CircleId(String value) {

	public CircleId {
		if (value == null)
			throw new NullPointerException("サークルIDはnullではいけません。");
	}
}
