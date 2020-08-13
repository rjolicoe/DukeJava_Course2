import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

/**
 * @author  Ryan Jolicoeur
 *
 *
 */

public class Main {

    public static void main(String[] args) {
        BigExporters be = new BigExporters();
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
       // be.eNumber(parser, 18);

        CountryInfo ci = new CountryInfo();
        // ci.countryList(parser, "Nauru");

        ListExportsTwoProducts letp = new ListExportsTwoProducts();
        // letp.listExportersTwoProducts(parser, "cotton", "flowers");

        NumberOfExporters noe = new NumberOfExporters();
        // noe.exporterNumber(parser,"cocoa");

        WhichCountriesExport wce = new WhichCountriesExport();
        wce.listExporters(parser, "gold");
    }
}
