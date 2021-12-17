package com.example.demo.models;

public class Ticket {
    private int ticketId;

    public Ticket() {
    }

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
