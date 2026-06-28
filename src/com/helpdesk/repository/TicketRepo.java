package com.helpdesk.repository;

import com.helpdesk.model.Ticket;
import java.util.ArrayList;
import java.util.List;

public class TicketRepo {
    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket getTicketById(int id) {
        for (Ticket t : tickets) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public List<Ticket> getTicketsByStatus(String status) {
    List<Ticket> filteredTickets = new ArrayList<>();

    for (Ticket ticket : tickets) {
        if (ticket.getStatus().equalsIgnoreCase(status)) {
            filteredTickets.add(ticket);
        }
    }

    return filteredTickets;
    }

}