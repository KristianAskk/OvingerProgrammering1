package oving4.oppgave2;

public class Spiller {
    private static final java.util.Random RANDOM = new java.util.Random();
    private int sumPoeng;


    public Spiller() {
        this.sumPoeng = 0;

    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen() {
        int terningskast = RANDOM.nextInt(6) + 1;
        if (terningskast == 1) {
            sumPoeng = 0;
        } else {
            if (sumPoeng > 100) {
                sumPoeng -= terningskast;
            } else {
                sumPoeng += terningskast;
            }
        }
    }

    public boolean erFerdig() {
        return sumPoeng == 100;
    }

}
