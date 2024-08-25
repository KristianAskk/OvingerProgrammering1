package oving10.oppgave1;

public class Arrangement {
    private static int arrangementNummer = 0;
    private final int nummer;
    private final String navn;
    private final String sted;
    private final String arrangoer;
    private final String type;
    private final Long tidspunkt;

    public Arrangement(String navn, String sted, String arrangoer, String type, Long tidspunkt) {
        this.nummer = arrangementNummer++;
        this.navn = navn;
        this.sted = sted;
        this.arrangoer = arrangoer;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }


    public String getSted() {
        return sted;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Arrangement{nummer=%d, navn='%s', sted='%s', arrangør='%s', type='%s', tidspunkt=%d}",
                nummer, navn, sted, arrangoer, type, tidspunkt);
    }
}
