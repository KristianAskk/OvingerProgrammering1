package oving3;

import java.util.Scanner;

public class Oppgave2 {

    public static boolean erPrimtall(int tall) {
        if (tall <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(tall); i++) {
            if (tall % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gjenta = "ja";
        System.out.println("Skriv avslutt for aa avbryte programmet.");
        do {

            System.out.println("Skriv inn et tall: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("avslutt")) {
                System.out.println("Avslutter programet.");
                break;
            }

            int svar;
            try {
                svar = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input. Vennligst skriv et tall eller 'avslutt'.");
                continue;
            }

            if (erPrimtall(svar)) {
                System.out.printf("Tallet %d er et primtall.\n", svar);
            } else {
                System.out.printf("Tallet %d er ikke et primtall.\n", svar);
            }
            System.out.println("Fortsett? (ja/nei)");

            gjenta = scanner.next();

        } while (gjenta.equalsIgnoreCase("ja"));
    }
}
