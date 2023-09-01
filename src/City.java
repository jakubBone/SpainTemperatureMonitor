import java.util.Scanner;

public class City extends Month{
    String name;

    City(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        name = scanner.nextLine();
    }
}
