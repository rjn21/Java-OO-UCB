package Abgabeblatt04;
import java.util.Scanner;

public class Aufgabe02 {
    public static double getPi() {
        Scanner scanner = new Scanner(System.in);
        int count = Aufgabe01.getInt(scanner);

        int inside = 0;

        double x, y;

        for (int i = 0; i < count; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1.0) {
                inside++;
            }
        }
        
        scanner.close();

        return inside / (double) count * 4;
    }
}
