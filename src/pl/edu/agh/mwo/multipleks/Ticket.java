package pl.edu.agh.mwo.multipleks;

public class Ticket {
    private Screening screening;
    private Seat seat;
    private Customer customer;

    public Ticket(Screening screening, Seat seat, Customer customer) {
        this.screening = screening;
        this.seat = seat;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Bilet: " + screening.getMovie().getTitle() +
                ", miejsce: " + seat.getNumber();
    }
}
