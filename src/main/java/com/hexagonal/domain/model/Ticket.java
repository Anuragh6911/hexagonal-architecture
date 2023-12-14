package com.hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Anurag Baskota
 * Date 04/12/23
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String key;
    private String userName;
    private double finalPrice;
    private double discountedPrice;
}
