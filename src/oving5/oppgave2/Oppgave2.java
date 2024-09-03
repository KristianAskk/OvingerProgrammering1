package oving5.oppgave2;

public class Oppgave2 {
    public static void main(String[] args) {

        int UPPER_BOUND = 38993802;
        for (int i = 0; i < 100000; i++) {
            double test = MinRandom.nesteDesimaltall(0, UPPER_BOUND);
            if (test > UPPER_BOUND && test > 0) {
                System.out.printf("Dette er feil %f\n", test);
            }
        }

        for (int i = 0; i < 100000; i++) {
            double test = MinRandom.nesteDesimaltall(0, UPPER_BOUND);
            if (test > UPPER_BOUND && test > 0) {
                System.out.printf("Dette er feil %f\n", test);
            }
        }

    }
}