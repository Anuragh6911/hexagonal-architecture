package com.hexagonal.adapter.driver.ticket;

import com.hexagonal.domain.model.Ticket;
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
public class TicketDto {
    private String key;
    private String userName;
    private double finalPrice;
    private double discountedPrice;

    public static Ticket toModel(TicketDto ticketDto) {
        return new Ticket(ticketDto.getKey(), ticketDto.getUserName(), ticketDto.getFinalPrice(), ticketDto.getDiscountedPrice());
    }

    public static TicketDto toDto(Ticket ticket) {
        return new TicketDto(ticket.getKey(), ticket.getUserName(), ticket.getFinalPrice(), ticket.getDiscountedPrice());
    }
}
