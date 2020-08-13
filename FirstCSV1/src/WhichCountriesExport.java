import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.Iterator;

public class WhichCountriesExport {

    public WhichCountriesExport() {
    }

    public void listExporters(CSVParser parser, String exportOfInterest) {
        Iterator var3 = parser.iterator();

        while(var3.hasNext()) {
            CSVRecord record = (CSVRecord)var3.next();
            String export = record.get("Exports");
            if (export.contains(exportOfInterest)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }

    }
}
