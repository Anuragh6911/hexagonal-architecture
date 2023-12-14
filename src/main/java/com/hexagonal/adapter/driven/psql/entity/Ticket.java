package com.hexagonal.adapter.driven.psql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Anurag Baskota
 * Date 07/12/23
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
    @Id
    private String key;
    private String userName;
    private double finalPrice;
    private double discountedPrice;

    public static Ticket toEntity(com.hexagonal.domain.model.Ticket ticket) {
        return new Ticket(ticket.getKey(), ticket.getUserName(), ticket.getFinalPrice(), ticket.getDiscountedPrice());
    }

    public static com.hexagonal.domain.model.Ticket toModel(Ticket ticket) {
        return new com.hexagonal.domain.model.Ticket(ticket.getKey(), ticket.getUserName(), ticket.getFinalPrice(), ticket.getDiscountedPrice());
    }

}
