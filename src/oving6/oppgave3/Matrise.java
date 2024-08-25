package oving6.oppgave3;

public class Matrise {
    private final int[][] matrise;

    public Matrise(int[][] matrise) {
        this.matrise = matrise;
    }

    private static Matrise transponer(Matrise matrise) {
        ///jdjdjd
        int kolonne = matrise.kolonneLengde();
        int rad = matrise.radLengde();
        int[][] nyMatrise = new int[kolonne][rad];

        for (int i = 0; i < rad; i++) {
            for (int j = 0; j < kolonne; j++) {
                nyMatrise[i][j] = matrise.getMatrise()[j][i];
            }
        }
        return new Matrise(nyMatrise);

    }

    public int radLengde() {
        return matrise.length;
    }

    public int kolonneLengde() {
        return matrise[0].length;
    }

    public int[][] getMatrise() {
        return matrise;
    }

    private Matrise check(Matrise matrise) {
        Matrise m = matrise;

        if (!sammeDimensjon(m)) {
            if (!sammeDimensjon(transponer(m))) {
                return null;
            }
            return transponer(m);
        }

        return m;
    }

//    public Matrise multipliser(Matrise matrise) {

    //   }

    public Matrise adder(Matrise matrise) {
        Matrise m = check(matrise);
        if (m == null) return null;

        int[][] nyMatrise = new int[m.radLengde()][m.kolonneLengde()];

        for (int i = 0; i < m.radLengde(); i++) {
            for (int j = 0; j < m.kolonneLengde(); j++) {
                nyMatrise[i][j] = m.getMatrise()[i][j] + this.matrise[i][j];
            }
        }

        return new Matrise(nyMatrise);
    }

    private boolean sammeDimensjon(Matrise matrise) {
        return radLengde() == matrise.radLengde() && kolonneLengde() == matrise.kolonneLengde();
    }


}
