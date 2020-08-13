import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.Iterator;

public class NumberOfExporters {

    public NumberOfExporters() {
    }

    public void exporterNumber(CSVParser parser, String exportItem) {
        Iterator var3 = parser.iterator();

        while(var3.hasNext()) {
            CSVRecord record = (CSVRecord)var3.next();
            String export = record.get("Exports");
            if (export.contains(exportItem)) {
                int number = record.get("Country").length();
                System.out.println(number);
            }
        }

    }
}
