package fr.exemple.pdf;

public class CommandeService {

    private PdfService pdfService = new PdfService();

    public void genererDocument(Client client, boolean adresseAIndiquer) {

        System.out.println("CommandeService.genererDocument()");

        pdfService.genererPdf(client, adresseAIndiquer);
    }
}