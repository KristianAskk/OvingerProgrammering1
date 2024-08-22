package oving8.oppgave1;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arbtakernr = 1000;
        int ansettelseaar = 1000;

        while (true) {
            System.out.println("Skriv inn fornavn: ");
            String fornavn = scanner.nextLine();
            System.out.println("Skriv inn etternavn: ");
            String etternavn = scanner.nextLine();
            System.out.println("Skriv inn fødselsår: ");
            int aarFoedt = scanner.nextInt();


            Person person = new Person(fornavn, etternavn, aarFoedt);

            // lget till arbtaker
            System.out.println("skriv månedslønn: ");
            int maanedslonn = scanner.nextInt();
            System.out.println("skriv skatteprosent: ");
            double skatteprosent = scanner.nextDouble();
            ArbTaker arbTaker = new ArbTaker(person, arbtakernr, ansettelseaar, maanedslonn, skatteprosent);
            arbtakernr++;
            System.out.println(arbTaker);
            while (true) // system with prompt to change different values  kan endre alt.
            {
                System.out.println("1. Endre månedslønn");
                System.out.println("2. Endre skatteprosent");
                System.out.println("3. Skriv ut skattetrekk");
                System.out.println("4. Skriv ut bruttolønn per år");
                System.out.println("5. Skriv ut skattetrekk per år");
                System.out.println("6. Avslutt");

                int choice = scanner.nextInt();
                scanner.nextLine();
                boolean avslutt = false;
                switch (choice) {
                    case 1:
                        System.out.println("Skriv inn ny månedslønn: ");
                        int nyMaanedslonn = scanner.nextInt();
                        arbTaker.setMaanedsloenn(nyMaanedslonn);
                        System.out.println("Ny månedslønn: " + arbTaker.getMaanedsloenn());
                        break;
                    case 2:
                        System.out.println("Skriv inn ny skatteprosent: ");
                        double nySkatteprosent = scanner.nextDouble();
                        arbTaker.setSkatteprosent(nySkatteprosent);
                        System.out.println("Ny skatteprosent: " + arbTaker.getSkatteprosent());
                        break;
                    case 3:
                        System.out.println("Skattetrekk: " + arbTaker.skatteTrekk());
                        break;
                    case 4:
                        System.out.println("Bruttolønn per år: " + arbTaker.bruttoloennPerAar());
                        break;
                    case 5:
                        System.out.println("Skattetrekk per år: " + arbTaker.skatteTrekkPerAar());
                        break;
                    case 6:
                        avslutt = true;
                        break;
                    default:
                        System.out.println("Ugyldig valg");
                        break;
                }

                if (avslutt) {
                    break;
                }

            }

            System.out.println("Vil du avslutte? (ja/nei)");
            String svar = scanner.nextLine();
            if (svar.equals("ja")) {
                break;
            }

        }


    }
}