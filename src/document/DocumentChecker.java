package document;

public class DocumentChecker {

    public static void main(String[] args) {
        // bezpośrednio dokument excela ExcelDocument document = new ExcelDocument();

        // odnosimy się do klasy bazowej, jednym z postaci dokumentów jest excel. Nasz dokument excela jest równiez dokumentem.
        // mamy wielopostaciowość Documentu

        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        // w zależnosci jakiego typu jest dokument to takie metody wykorzystujemy

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
