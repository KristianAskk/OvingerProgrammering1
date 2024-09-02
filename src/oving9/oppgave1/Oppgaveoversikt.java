package oving9.oppgave1;


import java.util.ArrayList;
import java.util.List;

public class Oppgaveoversikt {

    private final List<Student> studenter;
    private int antStud = 0;


    public Oppgaveoversikt() {
        this.studenter = new ArrayList<>();
    }

    public int getAntStud() {
        return antStud;
    }

    public void registrerNyStudent(Student student) {
        studenter.add(student);
        antStud++;
    }

    public void oekAntallOppgaver(String navn, int oekning) {
        for (Student student : studenter) {
            if (student.getNavn().equalsIgnoreCase(navn)) {
                student.oekAntOppg(oekning);
                return;
            }
        }

        throw new IllegalArgumentException("Studenten finnes ikke");
    }

    public int antallOppgaverLoestAvStudent(String navn) {
        for (Student student : studenter) {
            if (student.getNavn().equalsIgnoreCase(navn)) {
                return student.getAntOppg();
            }
        }

        throw new IllegalArgumentException("Studenten finnes ikke");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Antall studenter: " + antStud + "\n");
        for (Student student : studenter) {
            sb.append(student.toString()).append("\n");
        }

        return sb.toString();
    }


}
