
package oving2;

import java.util.Scanner;

public class Oppgave1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn et aar: ");

        int aar = scanner.nextInt();

        // sjekker om det er et aarhundre.
        if (aar % 100 == 0) {
            // sjekker om aarhundret er delelig med 400
            if (aar % 400 == 0) {
                System.out.printf("Aaret %d er et skuddaar.", aar);
            } else {
                System.out.printf("Aaret %d er ikke et skuddaar.", aar);
            }

        } else if (aar % 4 == 0) {
            System.out.printf("Aaret %d er et skuddaar.", aar);
        } else {
            // hvis ingen av kravene er moett, er det ikke et skuddaar.
            System.out.printf("Aaret %d er ikke et skuddaar.", aar);
        }
    }
}