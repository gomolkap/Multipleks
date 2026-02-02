package pl.edu.agh.mwo.multipleks;

import java.util.HashMap;
import java.util.Map;

public class Hall {
    private String name;
    private Map<String, Seat> seats = new HashMap<>();

    public Hall(String name, int seatCount) {
        this.name = name;
        for (int i = 1; i <= seatCount; i++) {
            seats.put("H" + i, new Seat("H" + i));
        }
    }

    public Seat getSeat(String seatNumber) {
        return seats.get(seatNumber);
    }
}
