package com.hexagonal.adapter.driven.psql;


import com.hexagonal.adapter.driven.psql.entity.Ticket;
import com.hexagonal.adapter.driven.psql.repo.TicketRepository;
import com.hexagonal.domain.ports.TicketRepo;
import jakarta.inject.Singleton;

/**
 * @author Anurag Baskota
 * Date 05/12/23
 */
@Singleton
class TicketRepoAdapter implements TicketRepo {
    private final TicketRepository ticketRepository;

    TicketRepoAdapter(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public com.hexagonal.domain.model.Ticket createTicket(com.hexagonal.domain.model.Ticket ticket) {
        Ticket psqlTicket = ticketRepository.save(Ticket.toEntity(ticket));
        return Ticket.toModel(psqlTicket);
    }

    @Override
    public com.hexagonal.domain.model.Ticket updateTicket(com.hexagonal.domain.model.Ticket ticket) {
        Ticket psqlTicket = ticketRepository.update(Ticket.toEntity(ticket));
        return Ticket.toModel(psqlTicket);
    }

    @Override
    public void deleteTicket(String key) {
        ticketRepository.deleteById(key);
    }
}
