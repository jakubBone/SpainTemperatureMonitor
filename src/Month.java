public abstract class Month {

    String monthName;
    int monthDays;
    int[] temperatureList;

    //public Month(int days) {
        //this.days = days;
    //}

    // Daily temperature creator method illustrating every day monitoring
    // Temperature is set randomly from the range of 25 - 45 degrees
    // Temperature order -> from 1st to the last day of month
    public void createTemperature() {
        temperatureList = new int[monthDays];
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
