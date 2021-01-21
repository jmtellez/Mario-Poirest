package com.boyz.mariopoirest.REST;

public class MarioNotFoundException extends RuntimeException {
 
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MarioNotFoundException() {
	}

    public MarioNotFoundException(String message) {
		super(message);
	}

    public MarioNotFoundException(Throwable cause) {
		super(cause);
	}

    public MarioNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

    public MarioNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}