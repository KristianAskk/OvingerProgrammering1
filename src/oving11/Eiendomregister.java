package oving11;

import java.util.ArrayList;
import java.util.List;

/**
 * Representerer et register av eiendommer. Denne klassen håndterer
 * lagring, registrering, sletting, og spørringer av eiendommer.
 *
 * Bruken av ArrayList er valgt for å gi en dynamisk og effektiv måte
 * å håndtere eiendommer på. ArrayList tillater fleksibel håndtering av
 * eiendommer uten behov for å spesifisere en fast størrelse på listen.
 * Dette gjør det lettere å legge til og fjerne eiendommer i sanntid.
 */
public class Eiendomregister {

    // Liste som lagrer alle eiendommer i registeret
    private List<Eiendom> eiendommer;

    /**
     * Konstruktør som initialiserer et tomt eiendomregister.
     * Bruker ArrayList for å kunne håndtere en variabel mengde eiendommer
     * uten å spesifisere en fast størrelse på forhånd.
     */
    public Eiendomregister() {
        this.eiendommer = new ArrayList<>();
    }

    /**
     * Registrerer en ny eiendom i registeret.
     *
     * @param eiendom Eiendom som skal registreres.
     */
    public void registrerEiendom(Eiendom eiendom) {
        eiendommer.add(eiendom);
    }

    /**
     * Sletter en eiendom fra registeret.
     *
     * @param eiendom Eiendom som skal slettes.
     */
    public void slettEiendom(Eiendom eiendom) {
        eiendommer.remove(eiendom);
    }

    /**
     * Henter antall eiendommer i registeret.
     *
     * @return Antall eiendommer.
     */
    public int antallEiendommer() {
        return eiendommer.size();
    }

    /**
     * Finner en eiendom basert på kommunenummer, gårdsnummer og bruksnummer.
     *
     * @param kommunenummer Kommunenummer for å finne eiendom.
     * @param gnr Gårdsnummer for å finne eiendom.
     * @param bnr Bruksnummer for å finne eiendom.
     * @return Eiendom som matcher kriteriene, eller null hvis ingen finnes.
     */
    public Eiendom finnEiendom(int kommunenummer, int gnr, int bnr) {
        for (Eiendom eiendom : eiendommer) {
            if (eiendom.getKommunenummer() == kommunenummer &&
                    eiendom.getGnr() == gnr &&
                    eiendom.getBnr() == bnr) {
                return eiendom;
            }
        }
        return null;
    }

    /**
     * Beregner gjennomsnittlig areal for alle eiendommer i registeret.
     *
     * @return Gjennomsnittlig areal, eller 0 hvis registeret er tomt.
     */
    public double gjennomsnittsareal() {
        return eiendommer.stream().mapToDouble(Eiendom::getAreal).average().orElse(0);
    }

    /**
     * Henter en liste over eiendommer som har et gitt gårdsnummer.
     *
     * @param gnr Gårdsnummer for å filtrere eiendommer.
     * @return Liste over eiendommer med det angitte gårdsnummeret.
     */
    public List<Eiendom> eiendommerEtterGittGaardsnummer(int gnr) {
        return eiendommer.stream().filter(eiendom -> eiendom.getGnr() == gnr).toList();
    }

    /**
     * Henter listen over alle eiendommer i registeret.
     *
     * @return Liste over alle registrerte eiendommer.
     */
    public List<Eiendom> getEiendommer() {
        return eiendommer;
    }
}
