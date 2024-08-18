import java.util.ArrayList;
import java.util.Arrays;

public class DNA {
    
    /*This program will recognise Proteins found in DNA from other proteins, by use of following properties:-
     * 1. DNA proteins start with ATG and End with TGA
     * 2. The no. of Bases between the above two are multiples of 3
    */

    public static void main(String[] args){

       String[] proteins = {"ATGCGATACGCTTGA", "ATGCGATACGTGA", "ATTAATATGTACTGA"};

        ArrayList<String> DNAprotein = new ArrayList<>();
        ArrayList<String> notDNAprotein = new ArrayList<>();


        for(String protein: proteins){
            if(isDNAprotein(protein) == true){
                DNAprotein.add(protein);
            } else if(isDNAprotein(protein) == false){
                notDNAprotein.add(protein);
            }
        }

        System.out.println("List of proteins given:- " + Arrays.toString(proteins));
        System.out.println("Number of DNA proteins:- " + DNAprotein);
        System.out.println("Number of non-DNA proteins:- " + notDNAprotein);
        
    }

    public static Boolean isDNAprotein(String proteinTobeChecked){
        if(proteinTobeChecked.substring(0,3).equals("ATG")) {

           int p = proteinTobeChecked.length();
           int startingIndex = p - 3;
           int endingIndex = p;

           if(proteinTobeChecked.substring(startingIndex, endingIndex).equals("TGA")){
            
            int m = proteinTobeChecked.length() - 6;

            if(m % 3 == 0){
                return true;
            }
           }      
        }
     return false;
    }
}
