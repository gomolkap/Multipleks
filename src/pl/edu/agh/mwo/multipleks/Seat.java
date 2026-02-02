package pl.edu.agh.mwo.multipleks;

public class Seat {
    private String number;
    private boolean reserved;

    public Seat(String number) {
        this.number = number;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        this.reserved = true;
    }

    public String getNumber() {
        return number;
    }
}
