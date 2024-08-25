package oving7.oppgave2;


public class Oppgave2 {
    public static void main(String[] args) {

        TekstBehandling tb = new TekstBehandling("Hei på deg! Hei på deg!");

        System.out.println(tb.antallOrd());
        System.out.println("Gjenomsnittlig ordlengde: " + tb.gjennomsnittligOrdlengde());
        System.out.println("Gjenomsnittlig ord per periode: " + tb.gjennomsnittligOrdPerPeriode());
        System.out.println(tb.skiftUtOrd("Hei", "Hallo"));
        System.out.println(tb.getTekst());
        System.out.println(tb.getCapitalizedTekst());


    }
}