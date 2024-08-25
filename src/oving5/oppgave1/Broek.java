package oving5.oppgave1;

public class Broek {
    private int teller;
    private int nevner;

    // getter og setter metoder
    // getTeller()
    Broek(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("nevner kan ikke vaere 0.");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    Broek(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void multipliser(Broek broek) {
        this.teller *= broek.getTeller();
        this.nevner *= broek.getNevner();
        forkortBroek();
    }

    public void divider(Broek broek) {
        this.teller *= broek.getNevner();
        this.nevner *= broek.getTeller();
        forkortBroek();
    }

    public void summer(Broek broek) {
        this.teller = (this.teller * broek.getNevner()) + (broek.getTeller() * this.nevner);
        this.nevner *= broek.getNevner();
        forkortBroek();
    }

    public void subtraher(Broek broek) {
        this.teller = (this.teller * broek.getNevner()) - (broek.getTeller() * this.nevner);
        this.nevner *= broek.getNevner();
        forkortBroek();
    }

    private void forkortBroek() {
        int delelig = gcd(teller, nevner);
        this.teller /= delelig;
        this.nevner /= delelig;

        // Hvis nevneren er negativ, flytt fortegnet til telleren
        if (this.nevner < 0) {
            this.teller *= -1;
            this.nevner *= -1;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a, b);
        int t = 1;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                t = i;
            }
        }

        return t;
    }

}
