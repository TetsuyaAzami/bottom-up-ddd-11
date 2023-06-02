package com.example.dddsample.exception.user;

public class UserNotFoundException extends RuntimeException {

	public static final String MESSAGE = "該当するユーザが見つかりませんでした。";

	public UserNotFoundException(){
		super(MESSAGE);
	}
}
