package oving7.oppgave1;

import java.util.Arrays;

public final class NyString {
    final private String streng;

    public NyString(String streng) {
        this.streng = streng;
    }

    public String forkorting() {
        return Arrays.stream(streng.split(" "))
                .map(ord -> ord.substring(0, 1))
                .reduce("", (full, ord) -> full + ord);
    }

    public String fjernKarakter(String karakter) {
        return Arrays.stream(streng.split(""))
                .filter(ord -> !ord.equalsIgnoreCase(karakter))
                .reduce("", (full, ord) -> full + ord);
    }

}
