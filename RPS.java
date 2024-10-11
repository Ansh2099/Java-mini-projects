import java.util.Random;
import java.util.Scanner;

public class RPS {

    static String input;
    static String computerOutput;

    static void computerResponse(){

        Random rc = new Random();

        int r = rc.nextInt(3) + 1;

        switch (r) {
            case 1 -> {
                computerOutput = "rock";
            }
            case 2 -> {
                computerOutput = "paper";
            }
            case 3 -> {
                computerOutput = "scissors";
            }
            default -> throw new AssertionError();
        }
    }

    static void outcome(){

        if(input.equals(computerOutput)){
            System.out.println("It's a DRAW !!!");
            return;
        }

        switch (input) {
            case "rock" -> {

                if(computerOutput.equals("paper")){
                    System.out.println("You LOST !!!");
                }else if(computerOutput.equals("scissors")){
                    System.out.println("You WON !!!");
                }
            } 

            case "paper" -> {

                if(computerOutput.equals("scissors")){
                    System.out.println("You LOST !!!");
                }else if(computerOutput.equals("rock")){
                    System.out.println("You WON !!!");
                }
            }

            case "scissors" -> {

                if(computerOutput.equals("rock")){
                    System.out.println("You LOST !!!");
                }else if(computerOutput.equals("paper")){
                    System.out.println("You WON !!!");
                }
            }
            default -> {

                System.out.println("CHOOSE AN APPROPRIATE INPUT");
                throw new AssertionError();
            }
        }
    }
    

    public static void main(String[] args){
    
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("***************************************************");
            System.out.println("");            
            System.out.println("Welcome!! Let's Play a classic game of Rock, Paper & Scissors");
            System.out.println("Choose your move: ");
            input = sc.next().toLowerCase();

        }
        
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        computerResponse();

        System.out.println("");
        System.out.println("Computer Choose: " + computerOutput);
        System.out.println("");

        outcome();
        
    }
}
