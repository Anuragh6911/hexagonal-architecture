package com.hexagonal.domain.exception.config;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

/**
 * @author Anurag Baskota
 * Date 08/12/23
 */

@Produces
@Singleton
@Requires(classes = {GlobalException.class})
public class CostumeExceptionHandler implements ExceptionHandler<GlobalException, HttpResponse<ErrorResponse>> {
    @Override
    public HttpResponse<ErrorResponse> handle(HttpRequest request, GlobalException exception) {
        return null;
    }
}
