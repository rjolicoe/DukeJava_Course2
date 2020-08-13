import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.Iterator;

public class ListExportsTwoProducts {

    public ListExportsTwoProducts() {
    }

    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
        Iterator var4 = parser.iterator();

        while (var4.hasNext()) {
            CSVRecord record = (CSVRecord) var4.next();
            String export = record.get("Exports");
            if (export.contains(exportItem1) && export.contains(exportItem2)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }


    }
}
