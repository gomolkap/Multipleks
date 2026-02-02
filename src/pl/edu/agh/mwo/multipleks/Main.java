package pl.edu.agh.mwo.multipleks;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema("Multikino Kraków", "Dobrego Pasterza 128, 31-416 Kraków");

        Hall hall1 = new Hall("Sala 1", 50);
        cinema.addHall(hall1);

        Movie movie = new Movie("Wielki Marty", 149);
        Screening screening = new Screening(
                movie,
                hall1,
                LocalDateTime.now().plusDays(1),
                TicketType.STANDARD
        );

        cinema.addScreening(screening);

        cinema.printProgramme();

        screening.reservePlaces("H1", "H2", "H3");

        Customer customer = new Customer("Piotr Nowak");
        screening.reservePlaces(customer, "H4", "H5");

        customer.showTickets();
    }
}
