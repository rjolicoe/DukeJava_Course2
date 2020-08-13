/**
 * @author Ryan Jolicoeur
 *
 * Build the FindGeneWhile class
 *  - Additional comments to follow
 */

public class FindGeneWhile {

    public FindGeneWhile() {
    }

    public String findGeneSimple(String dna) {
        int startIndex = dna.indexOf("ATG");

        for(int currIndex = dna.indexOf("TAA", startIndex + 3); currIndex != -1; currIndex = dna.indexOf("TAA", currIndex + 1)) {
            if ((currIndex - startIndex) % 3 == 0) {
                return dna.substring(startIndex, currIndex + 3);
            }
        }

        return "";
    }
}
