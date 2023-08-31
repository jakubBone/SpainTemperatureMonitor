public class SpainTemperatureMonitor {
    public static void main(String[] args) {

        SpainTemperatureMonitor x = new SpainTemperatureMonitor();

        // September temperatures list basaed of every day monitoring
        // Temperature order -> from 1st to 31 day of September in table
        int[] septebmerBarcelonaTemperatures = {31, 32, 32, 29, 28, 28, 30, 31, 30, 29, 27, 26, 25, 24, 23,
                25, 26, 27, 28, 29, 30, 31, 31, 29, 28, 27, 26, 25, 24, 23};
        int[] septemberSevillaTemperatures = {35, 36, 36, 33, 32, 32, 34, 35, 34, 33, 31, 30, 29, 28, 27, 29,
                30, 31, 32, 33, 34, 35, 35, 33, 32, 31, 30, 29, 28, 27};
        int[] tab = {3, 4, 5, 1, 2, 4, 5};

    }
    public void temperatureDaysComparator(int[] temperatureList) {
        int parameter =0;
        for (int i = 0; i < temperatureList.length -1 ; i++) {
            for (int j = 0; j < temperatureList.length - 1; j++) {
                if (temperatureList[j] > temperatureList[j + 1])
                    parameter = temperatureList[j + 1];
                    temperatureList[j + 1] = temperatureList[j];
                    temperatureList[j] = parameter;
            }
        }
    }
}

