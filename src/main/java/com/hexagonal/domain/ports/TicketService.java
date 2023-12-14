package com.hexagonal.domain.ports;

import com.hexagonal.domain.model.Ticket;

/**
 * @author Anurag Baskota
 * Date 05/12/23
 */
public interface TicketService {
    Ticket saveTicket(Ticket ticket);

    Ticket editTicket(Ticket ticket);

    void deleteTicket(String key);
}
