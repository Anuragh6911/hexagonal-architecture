package com.hexagonal.domain.exception.config;

import io.micronaut.http.HttpStatus;

/**
 * @author Anurag Baskota
 * Date 08/12/23
 */
public class GlobalException extends RuntimeException {

    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

    public GlobalException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public GlobalException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return httpStatus;
    }


}
