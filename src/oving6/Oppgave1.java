package oving6;

import java.util.Random;


public class Oppgave1 {
    public static final int ITERASJONER = 10000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] antall = new int[10];

        for (int i = 0; i < ITERASJONER; i++) {
            int tilfeldigTall = random.nextInt(10);
            antall[tilfeldigTall] += 1;
        }

        System.out.printf("Totalt antall iterasjoner: %d\n", ITERASJONER);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Tallet %d kom ut %d ganger.\n", i, antall[i]);
        }

        System.out.println("Stjernerepresentasjon:");

        for (int i = 0; i < 10; i++) {
            int antallStjerner = Math.round((float) antall[i] / ITERASJONER * 100);
            String stjerner = "*".repeat(antallStjerner);
            System.out.printf("%d, %d:" + stjerner + "\n", i, antall[i]);
        }
    }
}