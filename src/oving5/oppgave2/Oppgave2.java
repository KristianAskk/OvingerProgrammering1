package oving5.oppgave2;

public class Oppgave2 {
    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            double test = MinRandom.nesteDesimaltall(0, 3);
            if (test > 3 && test > 0) {
                System.out.printf("Dette er feil %f\n", test);
            }
        }
        for (int i = 0; i < 100000; i++) {
            double test = MinRandom.nesteDesimaltall(0, 3);
            if (test > 3 && test > 0) {
                System.out.printf("Dette er feil %f\n", test);
            }
        }

    }
}