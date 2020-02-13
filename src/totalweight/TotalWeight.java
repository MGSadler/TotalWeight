package totalweight;

public class TotalWeight {

    public static void main(String[] args) {
        /*The Syntax Error was no semi-colon at the end of line 13 or (" ounces in each loaf, ");
         *Semantic Error was using an addition symbol instead of multiplication for totalWeight on line 15
         */
        
        int weightOfLoaf = 16; // ounces per loaf
        int numberOfLoaves = 4;
        
        System.out.print("With a weight of " + weightOfLoaf + " ounces in each loaf, ");
        System.out.println("and a total of " + numberOfLoaves + " loaves, ");
        int totalWeight = weightOfLoaf * numberOfLoaves;
        System.out.println("the total weight of all " + numberOfLoaves + " loaves is " + totalWeight + " ounces.\n");
    }
    
}
