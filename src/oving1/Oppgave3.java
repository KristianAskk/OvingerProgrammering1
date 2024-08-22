package oving1;

import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {

        // Leser antall sekunder
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn antall sekunder");
        int antallSekunderTotalt = scanner.nextInt();

        // beregner sekundene i antall timer, minutter og sekunder
        int antallTimer = antallSekunderTotalt / 3600;
        int antallMinutter = (antallSekunderTotalt % 3600) / 60;
        int antallSekunder = ((antallSekunderTotalt % 3600) % 60);

        // printer resultatet.
        System.out.printf("%d sekunder blir %d timer, %d minutter og %d sekunder.", antallSekunderTotalt, antallTimer, antallMinutter, antallSekunder);

    }
}