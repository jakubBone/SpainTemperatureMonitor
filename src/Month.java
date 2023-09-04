import java.util.Scanner;

public abstract class Month {
    int monthIndex;
    int year;
    int monthDays;
    int[] temperatureList;
    static int status = 1;

    Scanner sc = new Scanner(System.in);
    public void temperatureMonitor() {
            askForMonth();
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

    public void askForMonth(){
        System.out.println("Choose the year: ");
        year = sc.nextInt();

        System.out.println("Choose the month: (January - 1, February - 2, ..., December - 12: ");
        monthIndex = sc.nextInt();

        switch (monthIndex){
            case 1, 3, 5, 7, 8, 10, 12:
                monthDays = 31;
                break;
            case 4, 6, 9, 11:
                monthDays = 30;
                break;
            case 2:
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

    // Daily temperature creator method illustrating every day monitoring
    // Temperature is set randomly in the range of temperature depeding on month
    // Temperature order -> from 1st to the last day of month
    public void createTemperature() {
        temperatureList = new int[monthDays];
        if (monthIndex >= 0 && monthIndex <= 4 || monthIndex >= 10 && monthIndex <= 12) {
            for (int i = 0; i < monthDays; i++) {
                temperatureList[i] = (int) (Math.random() * (25 - 10) + 10);
            }
        } else if (monthIndex >= 5 && monthIndex <= 6){
            for (int i = 0; i < monthDays; i++) {
                temperatureList[i] = (int) (Math.random() * (35 - 25) + 25);
            }
        } else if (monthIndex >= 7 && monthIndex <= 9){
            for (int i = 0; i < monthDays; i++) {
                temperatureList[i] = (int) (Math.random() * (45 - 25) + 25);
            }
        }
    }
    public void printTemperature() {
        for (int element : temperatureList) {
            System.out.print(element + ", ");
        }
    }
    public void temperatureSorter() {
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
