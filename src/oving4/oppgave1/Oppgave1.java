package oving4.oppgave1;

import java.util.Scanner;


public class Oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Valuta dollar = new Valuta(10.50, "USD");
        Valuta euro = new Valuta(9.50, "EUR");
        Valuta sek = new Valuta(1.03, "SEK");
        Valuta nok = new Valuta(1.00, "NOK");


        while (true) {
            System.out.println("Velg valuta:");
            System.out.println("1: dollar");
            System.out.println("2: euro");
            System.out.println("3: svenske kroner");
            System.out.println("4: avslutt");

            int valg = scanner.nextInt();

            if (valg == 4) {
                break;
            }

            System.out.println("Skriv inn beloep:");
            double beloep = scanner.nextDouble();

            System.out.println("1: fra valgt valuta til NOK");
            System.out.println("2: fra NOK til valgt valuta");

            int valg2 = scanner.nextInt();

            if (valg2 == 1) {
                switch (valg) {
                    case 1:
                        System.out.printf("%.2f %s er %.2f NOK\n", beloep, dollar.getValuta(), dollar.tilNok(beloep));
                        break;
                    case 2:
                        System.out.printf("%.2f %s er %.2f NOK\n", beloep, euro.getValuta(), euro.tilNok(beloep));
                        break;
                    case 3:
                        System.out.printf("%.2f %s er %.2f NOK\n", beloep, sek.getValuta(), sek.tilNok(beloep));
                        break;
                }
            } else {
                switch (valg) {
                    case 1:
                        System.out.printf("%.2f NOK er %.2f %s\n", beloep, dollar.fraNok(beloep), dollar.getValuta());
                        break;
                    case 2:
                        System.out.printf("%.2f NOK er %.2f %s\n", beloep, euro.fraNok(beloep), euro.getValuta());
                        break;
                    case 3:
                        System.out.printf("%.2f NOK er %.2f %s\n", beloep, sek.fraNok(beloep), sek.getValuta());
                        break;
                }
            }

        }
    }
}

