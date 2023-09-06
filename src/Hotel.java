import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hotel {
    private String name;
    private int starsRating;

    public Hotel(String name, int starsRating) {
        this.name = name;
        this.starsRating = starsRating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStarsRating() {
        return starsRating;
    }
    public void setStarsRating(int starsRating) {
        this.starsRating = starsRating;
    }

    @Override
    public String toString(){
        return name + " " + starsRating;
    }
}

