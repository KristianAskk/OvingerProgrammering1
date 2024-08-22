package oving9.oppgave1;

public class Student {
    private String navn;
    private int antOppg;

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
        this.antOppg += antOppg;
    }

    @Override
    public String toString() {
        return "TODO";
    }
}
