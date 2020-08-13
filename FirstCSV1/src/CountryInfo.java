import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.Iterator;

public class CountryInfo {

    public CountryInfo() {
    }

    public void countryList(CSVParser parser, String countryNm) {
        Iterator var3 = parser.iterator();

        while (var3.hasNext()) {
            CSVRecord record = (CSVRecord) var3.next();
            String country = record.get("Country");
            if (country.contains(countryNm)) {
                String countryN = record.get("Country");
                String exportsN = record.get("Exports");
                String valueN = record.get("Value (dollars)");
                System.out.print(countryN + " ");
                System.out.print(exportsN + " ");
                System.out.println(valueN);
            }
        }
    }


}
