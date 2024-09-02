package oving10.oppgave2;

public class Rett {
    private final String navn;
    private final int pris;
    private final RettType type;
    private final String oppskrift;

    public Rett(String navn, int pris, RettType type, String oppskrift) {
        this.navn = navn;
        this.pris = pris;
        this.type = type;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public int getPris() {
        return pris;
    }

    public RettType getType() {
        return type;
    }

    public String getOppskrift() {
        return oppskrift;
    }


}
