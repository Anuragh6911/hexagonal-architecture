package com.hexagonal.domain.ports;


import com.hexagonal.domain.model.Ticket;

/**
 * @author Anurag Baskota
 * Date 05/12/23
 */
public interface TicketRepo {
    public Ticket createTicket(Ticket tIcket);

    Ticket updateTicket(Ticket ticket);

    void deleteTicket(String key);
}
