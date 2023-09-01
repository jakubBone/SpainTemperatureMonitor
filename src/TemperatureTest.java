import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {



        City barcelona = new City();
        barcelona.monthName = "September";
        barcelona.monthDays = 31;
        barcelona.createTemperature();
        barcelona.printTemperature();

        barcelona.temperatureSorter();
        barcelona.printTemperature();

    }
}

