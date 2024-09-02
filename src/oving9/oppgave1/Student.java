package oving9.oppgave1;

public class Student {
    private final String navn;
    private int antOppg; // antall godkjente oppgaver.

    Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void oekAntOppg(int oekning) {
        antOppg += oekning;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", antall godkjente oppgaver: " + antOppg;
    }
}
