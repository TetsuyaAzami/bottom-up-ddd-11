package com.example.dddsample.domain;

import org.springframework.util.StringUtils;

public record UserName(String value) {

	private static final Integer MIN_LENGTH = 5;

	private static final Integer MAX_LENGTH = 20;

	public UserName {
		if (!StringUtils.hasText(value)) {
			throw new IllegalArgumentException("ユーザ名はblankではいけません");
		}
		if (value.length() < MIN_LENGTH || MAX_LENGTH < value.length()) {
			throw new IllegalArgumentException(
					"ユーザ名は" + MIN_LENGTH + "文字以上" + MAX_LENGTH + "文字以内にしてください");
		}
	}

}
