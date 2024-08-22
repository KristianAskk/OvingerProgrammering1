package oving6.oppgave2;

import java.util.ArrayList;

public class TekstAnalyse {
    private final String tekst;
    private final int[] antallTegn = new int[30];

    TekstAnalyse(String tekst) {
        this.tekst = tekst.toLowerCase();

        initialiserForekomster();

    }

    private void initialiserForekomster() {
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) >= 'a' && tekst.charAt(i) <= 'z') {
                antallTegn[tekst.charAt(i) - 'a'] += 1;
            } else {
                parseTegn(String.valueOf(tekst.charAt(i)));
            }
        }

    }

    private void parseTegn(String tegn) {
        switch (tegn) {
            case "æ":
                antallTegn[26] += 1;
                break;
            case "ø":
                antallTegn[27] += 1;
                break;
            case "å":
                antallTegn[28] += 1;
                break;
            default:
                antallTegn[29] += 1;
                break;
        }
    }

    public int antallForskjelligeBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] >= 1) {
                sum += 1;
            }
        }
        return sum;
    }

    public int antallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            sum += antallTegn[i];
        }
        return sum;
    }

    public double ikkeBokstaverProsent() {
        return (double) antallTegn[29] / tekst.length() * 100;
    }

    public int forekomsterBestemtBokstav(String bokstav) {
        if (bokstav.length() > 1) {
            return 0;
        }
        if (bokstav.charAt(0) >= 'a' && bokstav.charAt(0) <= 'z') {
            return antallTegn[bokstav.charAt(0) - 'a'];
        } else {
            return switch (bokstav) {
                case "æ" -> antallTegn[26];
                case "ø" -> antallTegn[27];
                case "å" -> antallTegn[28];
                default -> antallTegn[29];
            };
        }
    }


    public String[] flestForekommelser() {
        int maksFrekvens = 0;
        ArrayList<Integer> flestBrukte = new ArrayList<>();

        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maksFrekvens) {
                maksFrekvens = antallTegn[i];
                flestBrukte.clear();
                flestBrukte.add(i);
            } else if (antallTegn[i] == maksFrekvens) {
                flestBrukte.add(i);
            }
        }

        String[] bokstaver = new String[flestBrukte.size()];

        for (int i = 0; i < flestBrukte.size(); i++) {
            if (flestBrukte.get(i) < 26) {
                bokstaver[i] = String.valueOf((char) (flestBrukte.get(i) + 'a'));
            } else {
                bokstaver[i] = switch (flestBrukte.get(i)) {
                    case 26 -> "æ";
                    case 27 -> "ø";
                    case 28 -> "å";
                    default -> " ";
                };
            }
        }

        return bokstaver;
    }


}
