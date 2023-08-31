public class TemperatureTest {
    public static void main(String[] args) {
        Month august = new Month(31);
        august.createTemperature();
        august.printTemperature();

        System.out.println();

        august.temperatureSorter();
        august.printTemperature();

    }
}

