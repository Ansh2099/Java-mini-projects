public class Droid {

// instance variables

    int batterylevel;
    String name;

// constrictor

public Droid(String droidName){
name = droidName;
batterylevel = 100;
}

// methods

public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    
    this.batterylevel = batterylevel - 10;

}


public void energyReport(){
     System.out.println("Battery remaining: " + batterylevel);
}

public void energyTransfer(Droid a, Droid b, int transfer){
    int c = a.batterylevel;
    int d = b.batterylevel;
    
   a.batterylevel = c - transfer;
   b.batterylevel = d + transfer;
   

}
    
    @Override
    public String toString(){
    return "Hello I'm the droid: " + name;
}

 
// main method
    public static void main(String[] args){

     // Commands for droid 1 (Codey)

    Droid Codey = new Droid("Codey");
    System.out.println (Codey);
    Codey.performTask("Dancing");
    Codey.energyReport();
    Codey.performTask("Cooking");
    Codey.energyReport();
    Codey.performTask("Singing");
    Codey.energyReport();
    

    // Commands for droid 2 (David)

    Droid David = new Droid("David");
    System.out.println(" ");
    System.out.println (David);
    David.performTask("Assisting Codey");
    David.energyReport();
    
 
    /* Commands for Energy transfer between droids 
    (empty print statements are there, so it looks nice in the terminal) */

    System.out.println("");
    System.out.println("Energy levels of Droids before energy transfer: ");
    Codey.energyReport();
    David.energyReport();

    Codey.energyTransfer(Codey, David, 10);

    System.out.println("");
    System.out.println( "Energy levels of Droids after energy transfer: ");
    Codey.energyReport();
    David.energyReport();
 }
}
