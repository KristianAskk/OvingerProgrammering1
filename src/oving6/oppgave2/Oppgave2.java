package oving6.oppgave2;

import java.util.Scanner;

public class Oppgave2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv inn en tekststreng (skriv avslutt for aa avslutte): ");
            String input = scanner.nextLine();
            if (input.equals("avslutt")) {
                break;
            }

            System.out.println("Skriv inn en bokstav for å finne antall forekomster: ");
            String bokstav = scanner.nextLine();

            TekstAnalyse tekstAnalyse = new TekstAnalyse(input);

            System.out.println("Antall forskjellige bokstaver: " + tekstAnalyse.antallForskjelligeBokstaver());
            System.out.println("Antall bokstaver: " + tekstAnalyse.antallBokstaver());
            System.out.println("Hvor stor del av bokstavene er ikke-bokstaver: " + tekstAnalyse.ikkeBokstaverProsent() + "%");
            System.out.println("Antall forekomster av bokstaven " + bokstav + ": " + tekstAnalyse.forekomsterBestemtBokstav(bokstav));
            System.out.print("bokstaver / bokstavene som forekommer oftest:");

            for (String bokstavForekomst : tekstAnalyse.flestForekommelser()) {
                System.out.printf(" %s", bokstavForekomst);
            }
            System.out.println();
        }

    }
}