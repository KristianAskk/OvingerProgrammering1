package oving8.oppgave1;


import java.util.GregorianCalendar;

public final class Person {
    private final String fornavn;
    private final String etternavn;
    private final int aarFoedt;

    Person(String fornavn, String etternavn, int aarFoedt) {
       this.fornavn = fornavn;
       this.etternavn = etternavn;
       this.aarFoedt = aarFoedt;
    }

    public String getFornavn() {
        return fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }

    public int getAarFoedt() {
        return aarFoedt;
    }



}
