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
    }
}




