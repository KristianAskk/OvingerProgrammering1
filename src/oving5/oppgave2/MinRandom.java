package oving5.oppgave2;


public class MinRandom {
    private static final java.util.Random RANDOM = new java.util.Random();


    public static int nesteHeltall(int nedre, int ovre) {
        return RANDOM.nextInt(ovre - nedre) + nedre;
    }

    public static double nesteDesimaltall(double nedre, double ovre) {
        return RANDOM.nextDouble(ovre) + nedre;
    }

}
