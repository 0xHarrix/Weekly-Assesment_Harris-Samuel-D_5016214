// Document.java
interface Document {
    void open();
}

// WordDocument.java
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
}

// PdfDocument.java
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

// ExcelDocument.java
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}

// DocumentFactory.java
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// WordDocumentFactory.java
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

// PdfDocumentFactory.java
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

// ExcelDocumentFactory.java
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// FactoryMethodPatternExample.java
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
