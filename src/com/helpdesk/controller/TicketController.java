package com.helpdesk.controller;

import com.helpdesk.service.TicketService;

public class TicketController {
    private TicketService service = new TicketService();

    public void createTicket(String title, String description) {
        service.createTicket(title, description);
    }

    public void viewTickets() {
        service.getTickets().forEach(System.out::println);
    }

    public void updateTicket(int id, String status) {
        service.updateStatus(id, status);
    }
}
