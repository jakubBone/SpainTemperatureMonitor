public class Hotel {
    String name;
    int starsRating;

    public Hotel(String name, int starsRating) {
        this.name = name;
        this.starsRating = starsRating;
    }
    @Override
    public String toString(){
        return name + " " + starsRating;
    }


}
