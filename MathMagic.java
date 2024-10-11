public class MathMagic{

//this program uses a equation which will return 3, no matter the input no.

    public static void main(String[] args){
        
        int myNumber = 5677;

     // Here myNumber will be considered the original no. from now on

        int stepOne = myNumber*myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo/ myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive/6;

        System.out.println(stepSix);
    }
}     

