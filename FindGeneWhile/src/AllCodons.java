/**
 * @author Ryan Jolicoeur
 *
 *
 */

public class AllCodons {
    public AllCodons() {
    }

    public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
        for(int currIndex = dnaStr.indexOf(stopCodon, startIndex); currIndex != -1; currIndex = dnaStr.indexOf(stopCodon, currIndex + 1)) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            }
        }

        return -1;
    }

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        } else {
            int taaIndex = this.findStopCodon(dna, startIndex, "TAA");
            int tagIndex = this.findStopCodon(dna, startIndex, "TAA");
            int tgaIndex = this.findStopCodon(dna, startIndex, "TGA");
            int minIndex = -1;
            if (taaIndex != -1 && (tgaIndex == -1 || tgaIndex >= taaIndex)) {
                minIndex = taaIndex;
            } else {
                minIndex = tgaIndex;
            }

            if (minIndex == -1 || tagIndex != -1 && tagIndex < minIndex) {
                minIndex = tagIndex;
            }

            return minIndex == -1 ? "" : dna.substring(startIndex, minIndex + 3);
        }
    }
}
