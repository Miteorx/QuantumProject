package com.example.demo.controllers;

import com.example.demo.models.Ticket;
import com.example.demo.service.implementation.MemoryTicket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TicketController {
    private final MemoryTicket memoryTicket;

    public TicketController(MemoryTicket memoryTicket) {
        this.memoryTicket = memoryTicket;
    }

    @GetMapping("/")
    public String ticket() {
        return "ticket";
    }

    @PostMapping("/")
    public String postTicket(Ticket ticket, Model model) {
        List<Ticket> tickets = memoryTicket.search();
        for (Ticket oneTicked : tickets) {
            if (oneTicked.getTicketId() == ticket.getTicketId()) {
                model.addAttribute("message", "Ticket exists!");
                return "ticket";
            }
        }
        model.addAttribute("message", "Ticket is not exists!");
        return "ticket";
    }
}
