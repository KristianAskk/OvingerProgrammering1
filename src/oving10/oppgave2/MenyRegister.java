package oving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    private final List<Meny> menyer;

    MenyRegister() {
        this.menyer = new ArrayList<Meny>();
    }

    public void registrerNyRett(Rett rett) {
        for (Meny meny : menyer) {
            meny.leggTilRett(rett);
        }
    }

    public Rett finnRett(String navn) {
        return menyer.stream().flatMap(meny -> meny.getRetter().stream()).filter(rett -> rett.getNavn().equalsIgnoreCase(navn)).findFirst().orElse(null);
    }

    public List<Rett> finnRetterAvType(RettType type) {
        return new ArrayList<Rett>(menyer.stream().flatMap(meny -> meny.getRetter().stream()).filter(rett -> rett.getType().equals(type)).toList());
    }

    public void registrerNyMeny(Meny meny) {
        menyer.add(meny);
    }

    public List<Meny> finnMenyerMedTotalprisInnenforIntervall(int start, int stopp) {
        List<Meny> menyList = new ArrayList<Meny>();
        for (Meny meny : menyer) {
            int totalpris = new ArrayList<Rett>(meny.getRetter()).stream().mapToInt(Rett::getPris).sum();
            if (totalpris >= start && totalpris <= stopp) {
                menyList.add(meny);
            }
        }
        return menyList;
    }
}

