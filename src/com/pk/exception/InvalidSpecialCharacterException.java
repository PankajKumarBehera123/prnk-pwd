package com.pk.exception;

public class InvalidSpecialCharacterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidSpecialCharacterException() {
		super();
	}

	public InvalidSpecialCharacterException(String message) {
		super(message);
	}

}
