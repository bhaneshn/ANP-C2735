package org.exception;

public class StudentValidateException extends RuntimeException{

	public StudentValidateException() {
		super();
	}
	public StudentValidateException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
