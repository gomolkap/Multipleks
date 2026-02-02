package pl.edu.agh.mwo.multipleks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Screening {
    private Movie movie;
    private Hall hall;
    private LocalDateTime dateTime;
    private TicketType type;
    private List<Ticket> tickets = new ArrayList<>();

    public Screening(Movie movie, Hall hall, LocalDateTime dateTime, TicketType type) {
        this.movie = movie;
        this.hall = hall;
        this.dateTime = dateTime;
        this.type = type;
    }

    public void reservePlaces(String... seatNumbers) {
        for (String seatNumber : seatNumbers) {
            Seat seat = hall.getSeat(seatNumber);
            if (seat != null && !seat.isReserved()) {
                seat.reserve();
                tickets.add(new Ticket(this, seat, null));
            }
        }
    }

    public void reservePlaces(Customer customer, String... seatNumbers) {
        for (String seatNumber : seatNumbers) {
            Seat seat = hall.getSeat(seatNumber);
            if (seat != null && !seat.isReserved()) {
                seat.reserve();
                Ticket ticket = new Ticket(this, seat, customer);
                tickets.add(ticket);
                customer.addTicket(ticket);
            }
        }
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return movie.getTitle() + " | " + dateTime + " | " + type;
    }
}
