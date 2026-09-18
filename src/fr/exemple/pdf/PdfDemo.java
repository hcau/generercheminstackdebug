package fr.exemple.pdf;

import java.util.Scanner;

public class PdfDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Écran ===");
        System.out.println("Adresse à indiquer ?");
        System.out.println("1 = oui");
        System.out.println("2 = non");

        int choix = scanner.nextInt();

        boolean adresseAIndiquer = choix == 1;

        System.out.println();
        System.out.println("Clic sur : Générer PDF");

        PdfAction action = new PdfAction();

        action.genererPdf(adresseAIndiquer);

        scanner.close();
    }
}
