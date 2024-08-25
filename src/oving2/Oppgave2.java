package oving2;

public class Oppgave2 {

    public static double kiloPris(double pris, double vekt) {
        return pris / vekt;
    }

    public static void main(String[] args) {

        double aPris = 35.90;
        double aVekt = 0.450;

        double bPris = 39.50;
        double bVekt = 0.500;

        double kiloPrisA = kiloPris(aPris, aVekt);
        double kiloPrisB = kiloPris(bPris, bVekt);

        if (kiloPrisA < kiloPrisB) {
            System.out.println("Produkt A er billigst.");
        } else {
            System.out.println("Produkt B er billigst.");
        }

    }
}