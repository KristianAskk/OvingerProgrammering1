package oving3;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gjenta = "ja";

        System.out.println("Skriv avslutt for aa avbryte programmet.");

        do {
            System.out.println("Multiplikasjonstabellen skal gaa fra:");
            String input = scanner.next();

            if (input.equalsIgnoreCase("avslutt")) {
                System.out.println("Programmet avsluttes.");
                break;
            }

            int start;
            try {
                start = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input. Vennligst skriv et tall eller 'avslutt'.");
                continue;
            }

            System.out.println("Til:");
            input = scanner.next();

            if (input.equalsIgnoreCase("avslutt")) {
                System.out.println("Programmet avsluttes.");
                break;
            }

            int stopp;
            try {
                stopp = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input. Vennligst skriv et tall eller 'avslutt'.");
                continue;
            }

            for (int i = start; i <= stopp; i++) {
                System.out.printf("%d-gangen: \n", i);
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%d x %d = %d \n", i, j, i * j);
                }
            }

            System.out.println("Ønsker du å generere flere multiplikasjonstabeller? (ja/nei)");
            gjenta = scanner.next();

        } while (gjenta.equalsIgnoreCase("ja"));

        System.out.println("Programmet avsluttes.");
    }
}
