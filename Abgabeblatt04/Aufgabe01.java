package Abgabeblatt04;
import java.util.Scanner;

public class Aufgabe01 {
    public static double mittelwert() {
        Scanner scanner = new Scanner(System.in);
        int eingabe, sum = 0, counter = 0;
        
        eingabe = getInt(scanner);
        while (eingabe >= 0) {
            counter++;
            sum += eingabe;
            eingabe = getInt(scanner);
        }
        
        scanner.close();
        return (double) sum / (double) counter;
    }

    public static int getInt(Scanner scanner) {
        System.out.print("Ganze Zahl eingeben: ");
        int eingabe = scanner.nextInt();
        return eingabe;
    }
}
