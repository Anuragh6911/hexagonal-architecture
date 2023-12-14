package com.hexagonal.adapter.driven.psql.repo;

import com.hexagonal.adapter.driven.psql.entity.Ticket;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

/**
 * @author Anurag Baskota
 * Date 07/12/23
 */

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {
}
