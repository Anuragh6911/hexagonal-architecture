package com.hexagonal.adapter.driver.ticket;

import com.hexagonal.domain.ports.TicketService;
import io.micronaut.http.annotation.*;

/**
 * @author Anurag Baskota
 * Date 05/12/23
 */

@Controller("/ticket")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Post
    public void saveTicket(@Body TicketDto ticketDto) {
        ticketService.saveTicket(TicketDto.toModel(ticketDto));
    }

    @Put
    public TicketDto editTicket(@Body TicketDto ticketDto) {
        return TicketDto.toDto(ticketService.editTicket(TicketDto.toModel(ticketDto)));
    }

    @Delete
    public void deleteTicketById(@QueryValue String key) {
        ticketService.deleteTicket(key);
    }

}
