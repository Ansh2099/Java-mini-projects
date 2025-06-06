import java.util.Scanner;

class factorial{

    public int factorial(int n){

        if(n == 1){
            return 1;
        } else if(n == 0) {
            return 1; // 0! is defined as 1
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        factorial fact = new factorial();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt(); // Example input
        int result = fact.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}