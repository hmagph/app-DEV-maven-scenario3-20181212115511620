package org.example;

public class MyException extends RuntimeException {
	private static final long serialVersionUID = -7464469949123119026L;
	public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyException(Throwable cause) {
        super(cause);
    }

}