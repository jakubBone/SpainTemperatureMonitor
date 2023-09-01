import java.util.Scanner;

public abstract class Month {
    int monthIndex;
    int year;
    int monthDays;
    int[] temperatureList;

    public void askForMonth(){
        Scanner sc = new Scanner(System.in);
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
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    monthDays = 29;
                else
                    monthDays = 28;
        }
    }


    // Daily temperature creator method illustrating every day monitoring
    // Temperature is set randomly from the range of 25 - 45 degrees
    // Temperature order -> from 1st to the last day of month
    public void createTemperature() {
        temperatureList = new int[monthDays];
        if(monthIndex >= 0 && monthIndex <= 4)
        for (int i = 0; i < monthDays; i++) {
            temperatureList[i] = (int) (Math.random() * (45 - 25) + 25);
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
