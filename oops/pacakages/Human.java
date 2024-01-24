package oops.pacakages;

public class Human {

    int salary ;
    String name;
    int age ;
    boolean married;
    static long population;

    public Human(int salary,String name,int age,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population  += 1;
    }

    
}
