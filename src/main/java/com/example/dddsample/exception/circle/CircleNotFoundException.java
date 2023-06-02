package com.example.dddsample.exception.circle;

public class CircleNotFoundException extends RuntimeException {

	public static final String MESSAGE = "該当するサークルが見つかりませんでした。";

	public CircleNotFoundException(){
		super(MESSAGE);
	};
}
