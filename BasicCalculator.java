public class BasicCalculator {

//constrictor

    public BasicCalculator(){
        
    }
// methods

    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divison(int a, int b){
        return a/b;
    }
    public int modulo(int a, int b){
        return a%b;
    }

//main method
    public static void main(String[] args){

        BasicCalculator myCalculator = new BasicCalculator();

        System.out.println(myCalculator.add(10,10));
        System.out.println(myCalculator.subtract(10,10));
        System.out.println(myCalculator.multiply(10,10));
        System.out.println(myCalculator.divison(10,10));
        System.out.println(myCalculator.modulo(10,10));
    }
}
