package oops;

import java.util.Arrays;

public class video1 {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
       

       

        
        Student devansh = new Student();

        // Student amol = new Student();


        // Student() is constructor ,, and that runs when you create an object and it allocate some variable
        // like Student(12,"rashi",56.76f)

        //  devansh.name  = "Devansh faujdar";
        //  devansh.rno = 19;
        //  devansh.marks = 88.9f;
        System.out.println(devansh.name);
        System.out.println(devansh.rno);
        System.out.println(devansh.marks);

        // System.out.println(amol.name);
        // System.out.println(amol.rno);
        // System.out.println(amol.marks);
        
    //   devansh.changeName("shoe lover");

    //    devansh.greeting();
      

    } 
}
  // creating a class for a every single student
  class Student {
    int rno;
    String name ;
    float marks;
    // if the  default value is assign then the default value it overwrite the given value.
  
    // we need a way to add the value of the above
    // properties obeject by object 
    // we need one word to access every object 
    //thats where wwe use "this" keyword it automaticaly replace with refrence variable

    Student(){ 
        this.rno = 18;
        this.name = "majestic narration" ; 
        this.marks  = 5.56f;
    }

    void greeting(){
        System.out.println("helllo my name is "  + this.name);
    }

    void changeName(String newName){
         name = newName;

    }
    Student( int rno,String name, float marks){ 
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
   