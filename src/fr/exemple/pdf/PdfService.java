package fr.exemple.pdf;

public class PdfService {

    public void genererPdf(Client client, boolean adresseAIndiquer) {

        System.out.println("=== Génération du PDF ===");

        ajouterNom(client);

        if (adresseAIndiquer) {
            ajouterAdresse(client);
        }

        enregistrerPdf();

        System.out.println("=== PDF terminé ===");
    }

    private void ajouterNom(Client client) {

        System.out.println("Nom : " + client.getNom());
    }

    private void ajouterAdresse(Client client) {

        System.out.println("Adresse : " + client.getAdresse());
    }

    private void enregistrerPdf() {

        System.out.println("PDF enregistré.");
    }
}