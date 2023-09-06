import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        while (Month.status == 1) {
            City newCity = new City();
            newCity.temperatureMonitor();
            if(Month.status == 0) {
                System.out.println("Thank you for using SpainTemperatureMonitor app. See you next time!");
                break;
            }
        }

        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hilton", 5));
        hotels.add(new Hotel("Radison Blue", 3));
        hotels.add(new Hotel("Riu Tequila", 4));


        System.out.println(hotels.toString());
    }
}




