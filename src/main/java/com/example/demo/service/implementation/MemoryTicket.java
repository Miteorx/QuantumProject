package com.example.demo.service.implementation;
import com.example.demo.models.Ticket;
import com.example.demo.service.api.TicketService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemoryTicket implements TicketService {
    private List<Ticket> ticketList = new ArrayList<>(Arrays.asList(
            new Ticket(55),
            new Ticket(40),
            new Ticket(30))
    );

    @Override
    public List<Ticket> search() {
        return ticketList;
    }
}
