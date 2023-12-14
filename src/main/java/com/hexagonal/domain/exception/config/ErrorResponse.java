package com.hexagonal.domain.exception.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Anurag Baskota
 * Date 08/12/23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;

    private int status;

    public int getStatus() {
        return status;
    }

    public Object getMessage() {
        return message;
    }
}
