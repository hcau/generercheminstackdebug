package fr.exemple.pdf;

public class PdfAction {

    private CommandeService commandeService = new CommandeService();

    public void genererPdf(boolean adresseAIndiquer) {

        System.out.println("PdfAction.genererPdf()");

        Client client = new Client(
                "Jean Dupont",
                "10 rue de Toulouse"
        );

        commandeService.genererDocument(
                client,
                adresseAIndiquer
        );
    }
}