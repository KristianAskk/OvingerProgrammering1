package oving8.oppgave1;

import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia;
    private final int arbtakernr;
    private final int ansettelseaar;
    private int maanedsloenn;
    private double skatteprosent;

    ArbTaker(Person personalia, int arbtakernr, int ansettelseaar, int maanedsloenn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelseaar = ansettelseaar;
        this.maanedsloenn = maanedsloenn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelseaar() {
        return ansettelseaar;
    }

    public int getMaanedsloenn() {
        return maanedsloenn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setMaanedsloenn(int maanedsloenn) {
        this.maanedsloenn = maanedsloenn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    public double skatteTrekk() {
        return skatteprosent * maanedsloenn;
    }

    public int bruttoloennPerAar() {
        return maanedsloenn * 12;
    }

    public double skatteTrekkPerAar() {
        return (skatteprosent * maanedsloenn * 10) + (skatteprosent * maanedsloenn * 0.5);
    }

    public String formatertNavn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public int antallAarAnsatt() {
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - ansettelseaar;
    }

    public boolean ansattLengerEnn(int antallAar) {
        return antallAarAnsatt() > antallAar;
    }

    public int alder() {
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - personalia.getAarFoedt();
    }

    @Override
    public String toString() {
        return "Arbeidstaker: " + formatertNavn() + "\n" +
                "Arbeidstakernummer: " + arbtakernr + "\n" +
                "Ansettelsesår: " + ansettelseaar + "\n" +
                "Månedslønn: " + maanedsloenn + "\n" +
                "Skatteprosent: " + skatteprosent + "\n" +
                "Skattetrekk: " + skatteTrekk() + "\n" +
                "Bruttolønn per år: " + bruttoloennPerAar() + "\n" +
                "Skattetrekk per år: " + skatteTrekkPerAar() + "\n" +
                "Alder: " + alder() + "\n" +
                "Antall år ansatt: " + antallAarAnsatt();
    }

}
