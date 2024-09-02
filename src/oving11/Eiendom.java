package oving11;

/**
 * Representerer en eiendom med forskjellige attributter som kommunenummer,
 * gårdsnummer, bruksnummer, areal og eierinformasjon.
 */
public class Eiendom {
    // Kommunenummer (skal være mellom 101 og 5054 inkludert)
    private int kommunenummer;

    // Navn på kommunen
    private String kommunenavn;

    // Gårdsnummer (må være et positivt heltall)
    private int gnr;

    // Bruksnummer (må være et positivt heltall)
    private int bnr;

    // Bruksnavn på eiendommen (kan være tomt hvis ikke aktuelt)
    private String bruksnavn;

    // Areal av eiendommen i kvadratmeter (må være et positivt tall)
    private double areal;

    // Navn på eieren av eiendommen
    private String eierNavn;

    /**
     * Konstruerer en Eiendom-instans med de gitte parameterne.
     *
     * @param kommunenummer Kommunenummer (101 til 5054).
     * @param kommunenavn Navn på kommunen.
     * @param gnr Gårdsnummer (må være positivt).
     * @param bnr Bruksnummer (må være positivt).
     * @param bruksnavn Bruksnavn på eiendommen (kan være tomt).
     * @param areal Areal av eiendommen i kvadratmeter (må være positivt).
     * @param eierNavn Navn på eieren.
     */
    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eierNavn) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        setGnr(gnr);
        setBnr(bnr);
        this.bruksnavn = bruksnavn;
        setAreal(areal);
        this.eierNavn = eierNavn;
    }

    /**
     * Returnerer en strengrepresentasjon av eiendom-ID i formatet:
     * kommunenummer-gnr/bnr (f.eks., 1504-54/73).
     *
     * @return En streng som representerer eiendom-ID.
     */
    public String eiendomIDStreng() {
        return String.format("%d-%d/%d", kommunenummer, gnr, bnr);
    }

    /**
     * Henter kommunenummer.
     *
     * @return Kommunenummer.
     */
    public int getKommunenummer() {
        return kommunenummer;
    }

    /**
     * Setter kommunenummer.
     *
     * @param kommunenummer Kommunenummer som skal settes.
     */
    public void setKommunenummer(int kommunenummer) {
        this.kommunenummer = kommunenummer;
    }

    /**
     * Henter navnet på kommunen.
     *
     * @return Navn på kommunen.
     */
    public String getKommunenavn() {
        return kommunenavn;
    }

    /**
     * Setter navnet på kommunen.
     *
     * @param kommunenavn Navn på kommunen som skal settes.
     */
    public void setKommunenavn(String kommunenavn) {
        this.kommunenavn = kommunenavn;
    }

    /**
     * Henter gårdsnummer.
     *
     * @return Gårdsnummer.
     */
    public int getGnr() {
        return gnr;
    }

    /**
     * Setter gårdsnummer. Gårdsnummer må være positivt.
     *
     * @param gnr Gårdsnummer som skal settes.
     * @throws IllegalArgumentException Hvis gårdsnummeret er negativt.
     */
    public void setGnr(int gnr) {
        if (gnr < 0) {
            throw new IllegalArgumentException("Gnr må være positivt");
        }
        this.gnr = gnr;
    }

    /**
     * Henter bruksnummer.
     *
     * @return Bruksnummer.
     */
    public int getBnr() {
        return bnr;
    }

    /**
     * Setter bruksnummer. Bruksnummer må være positivt.
     *
     * @param bnr Bruksnummer som skal settes.
     * @throws IllegalArgumentException Hvis bruksnummeret er negativt.
     */
    public void setBnr(int bnr) {
        if (bnr < 0) {
            throw new IllegalArgumentException("Bnr må være positivt");
        }
        this.bnr = bnr;
    }

    /**
     * Henter bruksnavn på eiendommen.
     *
     * @return Bruksnavn.
     */
    public String getBruksnavn() {
        return bruksnavn;
    }

    /**
     * Setter bruksnavn på eiendommen.
     *
     * @param bruksnavn Bruksnavn som skal settes.
     */
    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    /**
     * Henter arealet av eiendommen i kvadratmeter.
     *
     * @return Areal av eiendommen.
     */
    public double getAreal() {
        return areal;
    }

    /**
     * Setter arealet av eiendommen. Arealet må være positivt.
     *
     * @param areal Areal som skal settes.
     * @throws IllegalArgumentException Hvis arealet er negativt.
     */
    public void setAreal(double areal) {
        if (areal < 0) {
            throw new IllegalArgumentException("Areal må være positivt");
        }
        this.areal = areal;
    }

    /**
     * Henter navnet på eieren.
     *
     * @return Navn på eieren.
     */
    public String getEierNavn() {
        return eierNavn;
    }

    /**
     * Setter navnet på eieren.
     *
     * @param eierNavn Navn på eieren som skal settes.
     */
    public void setEierNavn(String eierNavn) {
        this.eierNavn = eierNavn;
    }
}
