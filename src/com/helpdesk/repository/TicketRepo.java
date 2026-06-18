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
}