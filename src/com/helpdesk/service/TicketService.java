package com.helpdesk.service;

import com.helpdesk.model.Ticket;
import com.helpdesk.repository.TicketRepo;
import java.util.List;

public class TicketService {
    private TicketRepo repo = new TicketRepo();

    public void createTicket(String title, String description) {
        Ticket ticket = new Ticket(title, description);
        repo.addTicket(ticket);
    }

    public List<Ticket> getTickets() {
        return repo.getAllTickets();
    }

    public void updateStatus(int id, String status) {
        Ticket ticket = repo.getTicketById(id);
        if (ticket != null) {
            ticket.setStatus(status);
        }
    }

    public List<Ticket> getTicketsByStatus(String status) {
    return repo.getTicketsByStatus(status);
    
    }
}