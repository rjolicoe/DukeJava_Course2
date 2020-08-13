import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.Iterator;

public class BigExporters {
    public BigExporters() {
    }

    public void eNumber(CSVParser parser, int valueItem) {
            Iterator var3 = parser.iterator();

            while(var3.hasNext()) {
                CSVRecord record = (CSVRecord)var3.next();
                int valueL = record.get("Value (dollars)").length();
                if (valueL > valueItem) {
                    String countryN = record.get("Country");
                    String valueN = record.get("Value (dollars)");
                    System.out.print(countryN + " ");
                    System.out.println(valueN);
                }
            }

        }

        public void test() {
            FileResource fr = new FileResource();
            CSVParser parser = fr.getCSVParser();
            this.eNumber(parser, 18);
        }
    }

