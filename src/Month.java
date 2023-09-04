import java.util.Scanner;

public abstract class Month {
    int monthIndex;
    int year;
    int monthDays;
    int[] temperatureList;
    static int status = 1;

    Scanner sc = new Scanner(System.in);

    // The principal method assuming the app logic
    public void temperatureMonitor() {
        askForDate();
        createTemperature();
        System.out.print("Temperatures from 1st to last day of month ||  ");
        printTemperature();
        temperatureSorter();
        System.out.print("Temperatures ordered from the the smallest to the highest || ");
        printTemperature();
        System.out.println();
        System.out.println("Would you like to check next city? YES: 1, NO: 0");
        status = sc.nextInt();
    }

    // The method asks a user for the date and checks if it is correct and if the year is leap
    public void askForDate() {
        while (true) {
            System.out.println("Choose the year: ");
            year = sc.nextInt();
            if (year >= 2000 && year <= 2023)
                break;
            else {
                if (year < 2000) {
                    System.out.println("Sorry. We have started monitor the temperatures since 2000");
                }
                System.out.println("Incorrect year. Try again.");
                System.out.println();
                }
            }
        while (true) {
            System.out.println("Choose the month: (January - 1, February - 2, ..., December - 12: ");
            monthIndex = sc.nextInt();
            if (monthIndex >= 1 && monthIndex <= 12)
                break;
            else {
                System.out.println("Incorrect month. Try again.");
                System.out.println();
            }
        }
        switch (monthIndex){
            case 1, 3, 5, 7, 8, 10, 12:
                monthDays = 31;
                break;
            case 4, 6, 9, 11:
                monthDays = 30;
                break;
            case 2:
                System.out.println();
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    monthDays = 29;
                    System.out.println("Leap year - 29days in February ");
                }
                else {
                    monthDays = 28;
                    System.out.println("Non-leap year - 28days in February");
                }
        }
    }

    // The method illustrates every day temperature monitoring
    // The temperature is setted randomy. The range of temperature depeds on the month and the season
    // The temperature order: 1st day -> last day of a month
    public void createTemperature () {
        temperatureList = new int[monthDays];
        if (monthIndex >= 0 && monthIndex <= 4 || monthIndex >= 10 && monthIndex <= 12) {
            for (int i = 0; i < monthDays; i++) {
                temperatureList[i] = (int) (Math.random() * (25 - 10) + 10);
            }
    } else if (monthIndex >= 5 && monthIndex <= 6) {
            for (int i = 0; i < monthDays; i++) {
                temperatureList[i] = (int) (Math.random() * (35 - 25) + 25);
            }
        } else if (monthIndex >= 7 && monthIndex <= 9) {
                for (int i = 0; i < monthDays; i++) {
                    temperatureList[i] = (int) (Math.random() * (45 - 25) + 25);
            }
        }
    }

    // The method prints temperatures
    public void printTemperature () {
        for (int i = 0; i < temperatureList.length; i++) {
            if (i == temperatureList.length - 1)
                System.out.println(temperatureList[i]);
            else
                System.out.print(temperatureList[i] + ", ");
        }
    }

    // The method sorts the temperatures using bubble sorting method
    public void temperatureSorter () {
        int parameter = 0;
        for (int i = 0; i < temperatureList.length - 1; i++) {
            for (int j = 0; j < temperatureList.length - 1; j++) {
                if (temperatureList[j] > temperatureList[j + 1]) {
                    parameter = temperatureList[j + 1];
                    temperatureList[j + 1] = temperatureList[j];
                    temperatureList[j] = parameter;
                }
            }
        }
        System.out.println();
    }
}