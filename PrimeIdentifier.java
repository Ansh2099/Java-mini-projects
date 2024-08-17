import java.util.ArrayList;
import java.util.Arrays;

public class PrimeIdentifier{
    public static void main(String[] args){

        // Original List Given

        int[] numberList = {1,2,3,4,5,6,7,8,9,10,7687,8570,98876};  

        ArrayList<Integer> primeNumber = new ArrayList<>();
        ArrayList<Integer> compositeNumber = new ArrayList<>();
    
        for( int number: numberList){

            if(primeNumberChecker(number) == true){
                primeNumber.add(number);
            } else if(primeNumberChecker(number) == false){
                compositeNumber.add(number);
            }
        }

        System.out.println("List of Numbers Given: " + Arrays.toString(numberList));
        System.out.println("Prime Numbers: " + primeNumber);
        System.out.println("Composite Number: " + compositeNumber);
    }

    // Main Identifier Method

    public static Boolean primeNumberChecker(int number){

        if(number < 2){
            return false;
        } else if(number == 2){
            return true;
        } else if (number % 2 == 0){
            return false;

        } for(int i = 3; i <= Math.sqrt(number); i+=2){

                if (number % i == 0) {
                    return false;                
                }
            }
            return true;
        }


        
}