package com.jd.webstore.exceptions;

public class ProductNotFoudException extends RuntimeException {


    public ProductNotFoudException() {
    }

    public ProductNotFoudException(String message) {
        super(message);
    }

    public ProductNotFoudException(String message, Throwable cause) {
        super(message, cause);
    }
}
