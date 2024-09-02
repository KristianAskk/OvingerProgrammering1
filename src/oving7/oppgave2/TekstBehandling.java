package oving7.oppgave2;

import java.util.Arrays;

public class TekstBehandling {
    private static final String PERIODE_REGEX = "[,!;?]";

    private final String streng;


    public TekstBehandling(String tekst) {
        this.streng = tekst;
    }

    public int antallOrd() {
        return streng.split(" ").length;
    }

    public double gjennomsnittligOrdlengde() {
        return Arrays.stream(streng.split(" "))
                .map(ord -> ord.replaceAll(PERIODE_REGEX, ""))
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }


    public double gjennomsnittligOrdPerPeriode() {
        return Arrays.stream(streng.split(PERIODE_REGEX))
                .limit(streng.split(PERIODE_REGEX).length - 1)
                .map(periode -> periode.split(" ").length)
                .mapToInt(ord -> ord)
                .average()
                .orElse(0);
    }

    public String skiftUtOrd(String gammel, String ny) {
        return streng.replaceAll("\\b" + gammel + "\\b(?=[.,!?;:]?|\\s|$)", ny);
    }

    public String getTekst() {
        return streng;
    }

    public String getCapitalizedTekst() {
        return streng.toUpperCase();
    }


}
