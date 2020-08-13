/**
 * @author Ryan Jolicoeur
 *
 * Find Gene While Clas and the All Codons class
 *
 */

public class Main {

    public static void main(String[] args) {
        FindGeneWhile fgw = new FindGeneWhile();
//        String dna = "AATGCGTAATTAATCG";
//        System.out.println("DNA strand is " + dna);
//        String gene = fgw.findGeneSimple(dna);
//        System.out.println("Gene is " + gene);
//        System.out.println("***************************");
//        dna = "CGATGGTTGATAAGCCTAAGCTATAA";
//        System.out.println("DNA strand is " + dna);
//        gene = fgw.findGeneSimple(dna);
//        System.out.println("Gene is " + gene);

        AllCodons ac = new AllCodons();
        String dna = "xxxxyyyyzzzTAAxxxyyyzzzTAAxxx";
        int dex = ac.findStopCodon(dna, 0, "TAA");
        if (dex != 9) {
            System.out.println("error on 9");
        }
        dex = ac.findStopCodon(dna, 9, "TAA");
        if (dex != 21) {
            System.out.println("error on 21");
        }
        dex = ac.findStopCodon(dna, 1, "TAA");
        if (dex != -1) {
            System.out.println("error on 26");
        }

        dex = ac.findStopCodon(dna, 0, "TAG");
        if (dex != -1) {
            System.out.println("error on 26 TAG");
        }

        System.out.println("tests finished");
        System.out.println("******************************************");
        dna = "ATGCCCGGGAAATAACCC";
        String gene = ac.findGene(dna);
        if (!gene.equals("ATGCCCGGGAAATAA")) {
            System.out.println("error");
        }

        System.out.println("tests finished");
    }


}
