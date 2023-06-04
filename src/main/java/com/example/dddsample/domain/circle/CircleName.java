package com.example.dddsample.domain.circle;

import org.springframework.util.StringUtils;

public record CircleName(String value) {

	private final static Integer MIN_LENGTH = 3;

	private final static Integer MAX_LENGTH = 20;

	public CircleName {
		if (!StringUtils.hasText(value))
			throw new IllegalArgumentException("サークル名はblankではいけません。");
		if (value.length() < MIN_LENGTH || MAX_LENGTH < value.length())
			throw new IllegalArgumentException(
					"サークル名は" + MIN_LENGTH + "文字以上" + MAX_LENGTH + "文字以内にしてください");
	}
}
