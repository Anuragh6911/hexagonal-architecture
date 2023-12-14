package com.hexagonal.usecase;

import com.hexagonal.domain.model.Ticket;
import com.hexagonal.domain.ports.TicketRepo;
import com.hexagonal.domain.ports.TicketService;
import jakarta.inject.Singleton;

/**
 * @author Anurag Baskota
 * Date 05/12/23
 */

@Singleton
class TicketServiceUseCase implements TicketService {

    private final TicketRepo ticketRepo;

    TicketServiceUseCase(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepo.createTicket(ticket);
    }

    @Override
    public Ticket editTicket(Ticket ticket) {
        return ticketRepo.updateTicket(ticket);
    }

    @Override
    public void deleteTicket(String key) {
        ticketRepo.deleteTicket(key);
    }
}
