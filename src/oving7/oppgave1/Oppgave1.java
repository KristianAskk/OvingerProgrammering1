package oving7.oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        NyString s = new NyString("æei hei hei. hei hei");

        System.out.println(s.forkorting());
        System.out.println(s.fjernKarakter("e"));
    }
}