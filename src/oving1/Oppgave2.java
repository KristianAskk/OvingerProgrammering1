package oving1;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leser og lagrer timene, minuttene, og sekundene
        System.out.println("Skriv antall timer: ");
        int antallTimer = scanner.nextInt();


        System.out.println("Skriv antall minutter: ");
        int antallMinutter = scanner.nextInt();

        System.out.println("Skriv antall sekunder: ");
        int antallSekunder = scanner.nextInt();


        // regner antall sekunder totalt
        int antallSekunderTotalt = antallTimer * 3600 + antallMinutter * 60 + antallSekunder;

        System.out.printf("%d timer, %d minutter, og %d sekunder, blir %d sekunder totalt.%n", antallTimer, antallMinutter, antallSekunder, antallSekunderTotalt);


    }
}
