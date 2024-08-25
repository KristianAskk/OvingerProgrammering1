package oving9.oppgave1;

import java.util.Scanner;

public class Oppgave1 {
    public static void testprogramForStudent() {
        // bruk assert, og bare klassen student.

        Student student = new Student("Ola", 10);
        assert student.getNavn().equals("Ola") : "Feil navn";
        assert student.getAntOppg() == 10 : "Feil antall oppgaver";
        student.oekAntOppg(5);
        assert student.getAntOppg() == 15 : "Feil antall oppgaver";

    }

    public static void main(String[] args) {
        //testProgramForStudent();

        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Legg til studenter: ");

        while (true) {
            System.out.println("Hva ønsker du å gjøre?");
            System.out.println("1: Legg til student");
            System.out.println("2: Øk antall oppgaver for en student");
            System.out.println("3: Se antall oppgaver løst av en student");
            System.out.println("4: Se alle studenter");
            System.out.println("5: Avslutt");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("Skriv inn navn på student: ");
                    scanner.nextLine(); // Consume the newline character
                    String navn = scanner.nextLine();
                    System.out.println("Skriv inn antall oppgaver studenten har løst: ");
                    int antOppg = scanner.nextInt();
                    Student student = new Student(navn, antOppg);
                    oppgaveoversikt.registrerNyStudent(student);
                    break;
                case 2:
                    System.out.println("Skriv inn navn på student: ");
                    scanner.nextLine(); // Consume the newline character
                    String navn2 = scanner.nextLine();
                    System.out.println("Skriv inn antall oppgaver du vil øke med: ");
                    int oekning = scanner.nextInt();
                    try {
                        oppgaveoversikt.oekAntallOppgaver(navn2, oekning);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Skriv inn navn på student: ");
                    scanner.nextLine(); // Consume the newline character
                    String n = scanner.nextLine();
                    try {
                        System.out.println(oppgaveoversikt.antallOppgaverLoestAvStudent(n));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println(oppgaveoversikt);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldig valg");
                    break;
            }
        }
    }
}