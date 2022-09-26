/* A Contructor in a java is a special method that is used to intialize objects. the constructor is called when an object of a class is created. it can be used to set intial values of object attributes. */

public class IntroductionOfConstructor {
    IntroductionOfConstructor(){
        System.out.println("I am Inside constructor");
    }
    public static void main(String[] args) {
        // Constructor is called when we create a obect.
        IntroductionOfConstructor obj = new IntroductionOfConstructor();
        System.out.println("I am inside main method");

        // Constructor is called when we create a obect.
        IntroductionOfConstructor obj2 = new IntroductionOfConstructor();
        System.out.println("I am inside main method");
       
    }
}

/*
   Output:
   I am Inside constructor
   I am inside main method
   I am Inside constructor
   I am inside main method

*/
