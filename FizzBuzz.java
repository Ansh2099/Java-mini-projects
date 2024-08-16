
public class FizzBuzz{

    public static void main(String[] args){

        /*  This program will print no. from 1 to 100, with a twist
        1. Multiples of 3:- Fizz
        2. Multiples of 5:- Buzz
        3. Multiples of both 3 and 5:- FizzBuzz   */

        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            } else if(i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
