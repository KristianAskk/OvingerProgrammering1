package oving11;

import java.util.Scanner;

public class Oving11 {

    // Konstantene for menyvalg
    private static final int ADD_PROPERTY = 1;
    private static final int LIST_ALL_PROPERTIES = 2;
    private static final int FIND_PROPERTY = 3;
    private static final int CALCULATE_AVERAGE_AREA = 4;
    private static final int EXIT = 9;

    private Eiendomregister register;
    private Scanner scanner;

    public Oving11() {
        this.register = new Eiendomregister();
        this.scanner = new Scanner(System.in);
    }

    private int showMenu() {
        int menyvalg = 0;
        System.out.println("\n***** Eiendomsregisterapplikasjon *****\n");
        System.out.println("1. Legg til eiendom");
        System.out.println("2. Skriv ut alle eiendommene");
        System.out.println("3. Soek etter eiendom");
        System.out.println("4. Gjennomsnittlig areal");
        System.out.println("9. Avslutt");
        System.out.println("\nTa et valg\n");

        if (scanner.hasNextInt()) {
            menyvalg = scanner.nextInt();
        } else {
            System.out.println("Skriv inn et tall, ikke tekst.");
            scanner.next();
        }
        return menyvalg;
    }

    public void start() {
        boolean ferdig = false;

        while (!ferdig) {
            int menyvalg = this.showMenu();
            switch (menyvalg) {
                case ADD_PROPERTY:
                    addProperty();
                    break;
                case LIST_ALL_PROPERTIES:
                    listAllProperties();
                    break;
                case FIND_PROPERTY:
                    searchProperty();
                    break;
                case CALCULATE_AVERAGE_AREA:
                    calculateAverageArea();
                    break;
                case EXIT:
                    System.out.println("Avslutter programmet.");
                    ferdig = true;
                    break;
                default:
                    System.out.println("Ugyldig menyvalg. Proev igjen.");
                    break;
            }
        }
    }

    private void addProperty() {
        System.out.println("Skriv kommunenummer:");
        int kommunenummer = scanner.nextInt();

        System.out.println("Skriv kommunenavn:");
        scanner.nextLine();
        String kommunenavn = scanner.nextLine();

        System.out.println("Skriv gnr:");
        int gnr = scanner.nextInt();

        System.out.println("Skriv bnr:");
        int bnr = scanner.nextInt();

        System.out.println("Skriv bruksnavn");
        scanner.nextLine();  // Consume newline
        String bruksnavn = scanner.nextLine();

        System.out.println("SKriv areal:");
        double areal = scanner.nextDouble();

        System.out.println("Skriv eiernavn:");
        scanner.nextLine();  // Consume newline
        String eierNavn = scanner.nextLine();

        Eiendom eiendom = new Eiendom(kommunenummer, kommunenavn, gnr, bnr, bruksnavn, areal, eierNavn);
        register.registrerEiendom(eiendom);
        System.out.println("La til eiendom");
    }

    private void listAllProperties() {
        if (register.antallEiendommer() == 0) {
            System.out.println("Ingen eiendommer registrert.");
        } else {
            for (Eiendom eiendom : register.getEiendommer()) {
                System.out.println(eiendom.eiendomIDStreng() + " - " + eiendom.getBruksnavn() + " - " + eiendom.getAreal() + "m² - Eier: " + eiendom.getEierNavn());
            }
        }
    }

    private void searchProperty() {
        System.out.println("Skriv kommunenummer:");
        int kommunenummer = scanner.nextInt();

        System.out.println("Skriv gnr:");
        int gnr = scanner.nextInt();

        System.out.println("Skriv bnr:");
        int bnr = scanner.nextInt();

        Eiendom eiendom = register.finnEiendom(kommunenummer, gnr, bnr);
        if (eiendom != null) {
            System.out.println("Eiendom fant: " + eiendom.eiendomIDStreng() + " - " + eiendom.getBruksnavn() + " - " + eiendom.getAreal() + "m² - Owner: " + eiendom.getEierNavn());
        } else {
            System.out.println("Fant ikke eiendom.");
        }
    }

    private void calculateAverageArea() {
        double averageArea = register.gjennomsnittsareal();
        System.out.println("Gjennomsnittlig areal: " + averageArea + " m²");
    }

    public static void main(String[] args) {
        Oving11 app = new Oving11();
        app.start();
    }
}
