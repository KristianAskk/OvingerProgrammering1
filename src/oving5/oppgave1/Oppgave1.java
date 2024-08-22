package oving5.oppgave1;


public class Oppgave1 {
    public static void main(String[] args) {
        Broek b1 = new Broek(3, 4);
        Broek b2 = new Broek(5, 6);

        System.out.println("b1: " + b1.getTeller() + "/" + b1.getNevner()); 
        System.out.println("b2: " + b2.getTeller() + "/" + b2.getNevner()); 

        b1.multipliser(b2);
        System.out.println("b1 * b2:" + b1.getTeller() + "/" + b1.getNevner()); 

        b1 = new Broek(3, 4);
        System.out.println("b1 reset:" + b1.getTeller() + "/" + b1.getNevner());

        b1.divider(b2);
        System.out.println("b1 / b2: " + b1.getTeller() + "/" + b1.getNevner());

        b1 = new Broek(3, 4);

        b1.summer(b2);
        System.out.println("b1 + b2: " + b1.getTeller() + "/" + b1.getNevner());

        b1 = new Broek(3, 4);

        b1.subtraher(b2);
        System.out.println("b1 - b2: " + b1.getTeller() + "/" + b1.getNevner());
    }
}