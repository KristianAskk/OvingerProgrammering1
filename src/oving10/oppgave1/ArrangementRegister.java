package oving10.oppgave1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrangementRegister {
    private final List<Arrangement> arrangementer;

    public ArrangementRegister() {
        this.arrangementer = new ArrayList<Arrangement>();
    }


    public void leggTilArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public List<Arrangement> arrangementerEtterGittSted(String sted) {
        return arrangementer.stream()
                .filter(arrangement -> arrangement.getSted().equalsIgnoreCase(sted))
                .toList();
    }

    public List<Arrangement> arrangementerEtterGittDato(long tidspunktUtenKlokkeslett) {
        return arrangementer.stream()
                .filter(arrangement -> fjernKlokkeslett(arrangement.getTidspunkt()) == tidspunktUtenKlokkeslett)
                .toList();
    }

    private long fjernKlokkeslett(long tidspunkt) {
        return tidspunkt / 10000;
    }

    public List<Arrangement> arrangementerInnenforTidsinterval(long start, long stopp) {
        List<Arrangement> a = new ArrayList<>(arrangementer.stream()
                .filter(arrangement -> arrangement.getTidspunkt() >= start && arrangement.getTidspunkt() <= stopp)
                .toList());
        a.sort(Comparator.comparingLong(Arrangement::getTidspunkt));

        return a;
    }

    public List<Arrangement> arrangementerSortertEtterSted() {
        List<Arrangement> a = new ArrayList<>(arrangementer);
        a.sort(Comparator.comparing(Arrangement::getSted));
        return a;
    }

    public List<Arrangement> arrangementerSortertEtterType() {
        List<Arrangement> a = new ArrayList<>(arrangementer);
        a.sort(Comparator.comparing(Arrangement::getType));
        return a;
    }

    public List<Arrangement> arrangementerSortertEtterTidspunkt() {
        List<Arrangement> a = new ArrayList<>(arrangementer);
        a.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return a;
    }


}
