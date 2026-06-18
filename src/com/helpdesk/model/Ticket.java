package com.helpdesk.model;

public class Ticket {
    private static int counter = 1;

    private int id;
    private String title;
    private String description;
    private String status;

    public Ticket(String title, String description) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.status = "Open";
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id +
               "\nTitle: " + title +
               "\nDescription: " + description +
               "\nStatus: " + status + "\n";
    }
}