/**
 * @author Ryan Jolicoeur
 *
 * Here we instantiate the FindSimpleGene object and run several test cases.
 * All test cases will be separated by
 * ***********************************
 *
 */

public class Main {

    public static void main(String[] args) {
        FindSimpleGene fsg = new FindSimpleGene();

        String dna = "AATGGCGTAATATGGT";
        System.out.println("DNA Strand is " + dna);
        String gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
        dna = "AATGGCTAGGGTAATATGGT";
        System.out.println("DNA Strand is " + dna);
        gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
        System.out.println("DNA Strand is " + dna);
        gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
        dna = "ATGATG";
        System.out.println("DNA Strand is " + dna);
        gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
        dna = "TAATAATAA";
        System.out.println("DNA Strand is " + dna);
        gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
        dna = "ATGABCDTAA";
        System.out.println("DNA Strand is " + dna);
        gene = fsg.findGeneSimple(dna);
        System.out.println("The gene for test case 1 is: " + gene);
        System.out.println("***********************************");
    }
}
