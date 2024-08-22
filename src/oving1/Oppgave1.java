package oving1;

import java.util.Scanner;

public class Oppgave1 {


    public static void main(String[] args) {
        // danner en scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn antall tommer: ");

        // leser tommer og konverterer til centimeter
        double tommer = scanner.nextDouble();
        double centimeter = tommer * 2.54;
        // skriver ut resultatet.
        System.out.printf("%.2f tommer blir %.2f cm.", tommer, centimeter);

    }
}