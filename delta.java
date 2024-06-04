package delta;

import java.util.Scanner;

/**
 * Rappresentazione di una classe che ti calcola il delta e la/e soluzione/i.
 *
 * @author Adolf Hitler
 * @version 1939
 */
public class Delta {

    public static void main(String[] args) throws Exception {
        Double a, b, c;
        Double delta, soluzione1, soluzione2;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.println("Inserisci valore A: ");
        a = sc.nextDouble();

        System.out.println("Inserisci valore B: ");
        b = sc.nextDouble();

        System.out.println("Inserisci valore C: ");
        c = sc.nextDouble();

        System.out.println("");

        // Delta
        delta = (b * b) - 4 * a * c;
        System.out.println("Valore del delta: " + delta + "\n");

        // Le varie soluzioni
        if (delta == 0) {
            soluzione1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("La soluzione: " + soluzione1);
        }

        if (delta < 0) {
            System.out.println("Non ha soluzioni");
        }

        if (delta > 0) {
            soluzione1 = (-b + Math.sqrt(delta)) / (2 * a);
            soluzione2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Le soluzioni: " + "\ncon +: " + soluzione1 + "\ncon -: " + soluzione2);

        }

        if (a == null || b == null || c == null || delta == null) {
            throw new Exception("Cambiare valore");
        }
    }

}
