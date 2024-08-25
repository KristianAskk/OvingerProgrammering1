package oving10.oppgave2;

import java.util.List;

public class Oppgave2 {
    public static void main(String[] args) {
        MenyRegister menyRegister = new MenyRegister();

        Rett rett1 = new Rett("Lasagne", 150, RettType.HOVEDRETT, "Lag lasagne med kjøttsaus og ostesaus");
        Rett rett2 = new Rett("Sjokoladekake", 80, RettType.DESSERT, "Bak kake med sjokolade og krem");
        Rett rett3 = new Rett("Bruschetta", 60, RettType.FORRETT, "Grill brød med tomater og basilikum");
        Rett rett4 = new Rett("Mineralvann", 30, RettType.DRIKKE, "Serveres kald med isbiter");

        Meny meny1 = new Meny();
        meny1.leggTilRett(rett1);
        meny1.leggTilRett(rett2);

        Meny meny2 = new Meny();
        meny2.leggTilRett(rett3);
        meny2.leggTilRett(rett4);

        menyRegister.registrerNyMeny(meny1);
        menyRegister.registrerNyMeny(meny2);

        menyRegister.registrerNyRett(new Rett("Salat", 90, RettType.TILBEHOR, "Bland salat, agurk, og tomater"));

        Rett funnetRett = menyRegister.finnRett("Sjokoladekake");
        System.out.println("Fant rett: " + funnetRett.getNavn() + " - Pris: " + funnetRett.getPris() + " kr");

        List<Rett> desserter = menyRegister.finnRetterAvType(RettType.DESSERT);
        System.out.println("Desserter i menyen:");
        for (Rett dessert : desserter) {
            System.out.println(dessert.getNavn() + " - Pris: " + dessert.getPris() + " kr");
        }

        List<Meny> menyerInnenPrisIntervall = menyRegister.finnMenyerMedTotalprisInnenforIntervall(100, 300);
        System.out.println("Menyer med totalpris mellom 100 og 300 kr:");
        for (Meny meny : menyerInnenPrisIntervall) {
            System.out.println("Meny:");
            for (Rett rett : meny.getRetter()) {
                System.out.println(" - " + rett.getNavn() + " (" + rett.getType() + ") - Pris: " + rett.getPris() + " kr");
            }
        }
    }
}
