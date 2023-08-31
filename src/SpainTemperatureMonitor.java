public class SpainTemperatureMonitor {
    public static void main(String[] args) {

        SpainTemperatureMonitor x = new SpainTemperatureMonitor();
        Month august = new Month(31);
        august.createTemperature();
        august.printTemperature();
        System.out.println();


        x.temperatureDaysComparator(august.temperatureList);
        august.printTemperature();


    }
    public void temperatureDaysComparator(int[] temperatureList) {
        int parameter = 0;
        for (int i = 0; i < temperatureList.length - 1 ; i++) {
            for (int j = 0; j < temperatureList.length - 1; j++) {
                if (temperatureList[j] > temperatureList[j + 1]) {
                    parameter = temperatureList[j + 1];
                    temperatureList[j + 1] = temperatureList[j];
                    temperatureList[j] = parameter;
                }
            }
        }
    }
}

