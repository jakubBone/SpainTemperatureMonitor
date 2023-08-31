public class Month {
    int days;
    int [] temperatureList;
    public Month(int days) {
        this.days = days;
    }

    // Daily temperature creator method illustrating every day monitoring
    // Temperature is set randomly from the range of 25 - 45 degrees
    // Temperature order -> from 1st to the last day of month
    public void createTemperature(){
        temperatureList = new int[days];
        for(int i = 0; i < days; i++){
            temperatureList[i] = (int) (Math.random() * (45 - 25) + 25);
        }
    }
    public void printTemperature() {
        for (int element : temperatureList) {
            System.out.print(element + ", ");
        }
    }
}
