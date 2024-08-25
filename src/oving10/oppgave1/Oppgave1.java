package oving10.oppgave1;

import java.util.List;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();

        register.leggTilArrangement(new Arrangement("Rockekonsert", "Oslo", "LiveNation", "Konsert", 202305151900L));
        register.leggTilArrangement(new Arrangement("Teaterstykke", "Bergen", "Den Nationale Scene", "Teater", 202305161800L));
        register.leggTilArrangement(new Arrangement("Fotballkamp", "Trondheim", "Rosenborg BK", "Sport", 202305171600L));
        register.leggTilArrangement(new Arrangement("Jazzkonsert", "Oslo", "Oslo Jazzfestival", "Konsert", 202305181930L));
        register.leggTilArrangement(new Arrangement("Kunstutstilling", "Stavanger", "Stavanger Kunstmuseum", "Utstilling", 202305191000L));

        System.out.println("Arrangementer i Oslo:");
        skrivUtArrangementer(register.arrangementerEtterGittSted("Oslo"));

        System.out.println("\nArrangementer 17. mai 2023:");
        skrivUtArrangementer(register.arrangementerEtterGittDato(20230517));

        System.out.println("\nArrangementer mellom 16. mai 2023 kl 12:00 og 18. mai 2023 kl 20:00:");
        skrivUtArrangementer(register.arrangementerInnenforTidsinterval(202305161200L, 202305182000L));

        System.out.println("\nAlle arrangementer sortert etter sted:");
        skrivUtArrangementer(register.arrangementerSortertEtterSted());

        System.out.println("\nAlle arrangementer sortert etter type:");
        skrivUtArrangementer(register.arrangementerSortertEtterType());

        System.out.println("\nAlle arrangementer sortert etter tidspunkt:");
        skrivUtArrangementer(register.arrangementerSortertEtterTidspunkt());
    }

    private static void skrivUtArrangementer(List<Arrangement> arrangementer) {
        if (arrangementer.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            for (Arrangement a : arrangementer) {
                System.out.println(a);
            }
        }
    }
}