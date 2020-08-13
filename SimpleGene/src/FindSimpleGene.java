/**
 * @author Ryan Jolicoeur
 *
 * Course 2: Java Specialization Find simple gene
 *
 * Method created to search for codon's ATG and TAA.
 *
 */

public class FindSimpleGene {
    public FindSimpleGene() {
    }

    public String findGeneSimple(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (startIndex == -1 && stopIndex == -1) {
            return "ATG & TAA are not contained; therefore not a valid gene";
        } else if (startIndex == -1 && stopIndex != -1) {
            return "ATG is not contained; therefore not a valid gene";
        } else if (stopIndex == -1 && startIndex != -1) {
            return "TAA is not contained; therefore not a valid gene";
        } else if ((stopIndex - startIndex) % 3 == 0) {
            result = dna.substring(startIndex, stopIndex + 3);
            return result;
        } else {
            return "not of valid length";
        }
    }

}
