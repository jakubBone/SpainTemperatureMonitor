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
        askForMonth();
        createTemperature();
        System.out.print(name + " - temperatures from 1st to last day of month ||  ");
        printTemperature();
        temperatureSorter();
        System.out.print(name + " - temperatures ordered from the the smallest to the highest || ");
        printTemperature();
        System.out.println();
        System.out.println("Would you like to check next city? YES: 1, NO: 0");
        status = sc.nextInt();

    }
}
