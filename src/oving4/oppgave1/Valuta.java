package oving4.oppgave1;

public class Valuta {

    private double kursPerNok;
    private String valutaNavn;

    Valuta(double kursPerNok, String valutaNavn) {
        this.kursPerNok = kursPerNok;
        this.valutaNavn = valutaNavn;
    }

    public double tilNok(double belop) {
        return belop * kursPerNok;
    }

    public double fraNok(double belop) {
        return belop / kursPerNok;
    }

    public String getValuta() {
        return valutaNavn;
    }
}
