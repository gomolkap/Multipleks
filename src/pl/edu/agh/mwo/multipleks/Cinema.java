package pl.edu.agh.mwo.multipleks;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Hall> halls = new ArrayList<>();
    private List<Screening> screenings = new ArrayList<>();

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printProgramme() {
        System.out.println("Repertuar kina: " + name);
        for (Screening s : screenings) {
            System.out.println(s);
        }
    }

    public Movie findMovie(String title) {
        for (Screening s : screenings) {
            if (s.getMovie().getTitle().contains(title)) {
                return s.getMovie();
            }
        }
        return null;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }
}
