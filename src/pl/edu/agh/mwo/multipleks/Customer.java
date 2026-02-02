package pl.edu.agh.mwo.multipleks;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Ticket> tickets = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void showTickets() {
        System.out.println("Bilety klienta: " + name);
        tickets.forEach(System.out::println);
    }
}
