// DataProcessor.java
abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        writeData();
    }

    abstract void readData();
    abstract void processData();
    abstract void writeData();
}

// CSVDataProcessor.java
class CSVDataProcessor extends DataProcessor {
    void readData() {
        System.out.println("Reading data from CSV file");
    }

    void processData() {
        System.out.println("Processing CSV data");
    }

    void writeData() {
        System.out.println("Writing data to CSV file");
    }
}

// XMLDataProcessor.java
class XMLDataProcessor extends DataProcessor {
    void readData() {
        System.out.println("Reading data from XML file");
    }

    void processData() {
        System.out.println("Processing XML data");
    }

    void writeData() {
        System.out.println("Writing data to XML file");
    }
}

// TemplateMethodPatternExample.java
public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
    }
}
