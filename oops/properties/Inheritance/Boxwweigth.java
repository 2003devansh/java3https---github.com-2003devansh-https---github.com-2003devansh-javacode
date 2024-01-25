package oops.properties.Inheritance;

public class Boxwweigth extends Box {
    double weight ;

    public Boxwweigth() {
        this.weight = -1;
    }

    public Boxwweigth(double height, double width, double length, double weight) {
        super(height, width, length); // super keyword :- call the parent class contructor
        // used to intialize value of parent class constructor
        this.weight = weight;
    }
    
    
}
