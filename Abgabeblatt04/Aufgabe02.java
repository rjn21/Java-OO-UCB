package Abgabeblatt04;
import java.util.Scanner;

public class Aufgabe02 {
    public static double getPi() {
        Scanner scanner = new Scanner(System.in);

        // Anzahl der "zufälligen" Punkte bestimmen
        int count = Aufgabe01.getInt(scanner);

        // zählt die Punkte, die sich innerhalb des Einheitskreises
        // befinden
        int inside = 0;

        // x- und y-Koordinaten eines Punktes
        double x, y;

        // count-Mal einen "zufälligen" Punkt genereieren und
        // überprüfen, ob dieser im Einheitskreis liegt
        for (int i = 0; i < count; i++) {
            // x und y "zufällig" bestimmen
            x = Math.random();
            y = Math.random();

            // überprüfen, ob x und y im Bereich liegen
            if (x * x + y * y <= 1.0) {
                inside++;
            }
        }

        // scanner schließen
        scanner.close();

        // Das Viertel des Einheitskreises mit 4 multiplizieren um
        // den ganzen Kreis zu berechnen (= Pi)
        return inside / (double) count * 4;
    }
}
