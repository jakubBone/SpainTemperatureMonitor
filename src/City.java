import java.util.Scanner;

public class City extends Month{
    String name;
    City(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        name = scanner.nextLine();
    }
    @Override
    public void temperatureMonitor() {
        askForDate();
        createTemperature();
        System.out.println();
        System.out.print(name + " - temperatures from 1st to last day of month:  ");
        printTemperature();
        temperatureSorter();
        System.out.print(name + " - temperatures ordered from the the lowest to the highest: ");
        printTemperature();
        System.out.println();
        System.out.println("Would you like to check next city? YES: 1 or NO: 0");
        status = sc.nextInt();
    }
}
