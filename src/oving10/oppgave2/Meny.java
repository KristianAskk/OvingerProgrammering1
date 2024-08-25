package oving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

public class Meny {
    private final List<Rett> retter;

    Meny() {
        this.retter = new ArrayList<Rett>();
    }

    public void leggTilRett(Rett rett) {
        retter.add(rett);
    }

    public List<Rett> getRetter() {
        return retter;
    }


}
