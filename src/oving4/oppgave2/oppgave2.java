package oving4.oppgave2;

import java.util.Scanner;

public class oppgave2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            Spiller spillerB = new Spiller();
            Spiller spillerA = new Spiller();

            int rundeNummer = 0;
            System.out.println("Begynner runde:");
            while (!spillerB.erFerdig() && !spillerA.erFerdig()) {
                rundeNummer += 1;
                spillerB.kastTerningen();
                spillerA.kastTerningen();

                System.out.printf("Runde %d: Spiller A har %d poeng, og spiller B har %d poeng.\n", rundeNummer, spillerA.getSumPoeng(), spillerB.getSumPoeng());

            }

            String feireMelding = (spillerA.erFerdig()) ? "Spiller A vant." : "Spiller B vant.";
            System.out.println(feireMelding);

            System.out.println("Ønsker du aa simulere en runde paa nytt? (ja/nei)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("ja")) {
               continue;
            }
            else {
                break;
            }
        }
    }
}