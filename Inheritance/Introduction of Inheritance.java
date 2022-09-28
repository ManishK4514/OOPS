class Base{
    int x = 4;
    void printX(){
       System.out.println("The value of x is: " + x);
    }
}

class Derived extends Base{
    int y = 5;

    void printY(){
        System.out.println("The value of y is: " + y);
    }
}
public class IntroductionOfInheritance {
    public static void main(String[] args) {
        // Creating object of Base class
        Base b = new Base();
        b.printX();
        // b.printY(); --> Throws an error we cant access the method of derived class using object of base class
        
        // Creating object of Derived class
        Derived d = new Derived();
        d.printX(); //--> we can access the method of base class using object of derived class
        d.printY();

        Base k = new Derived();
        k.printX();
        // k.printY(); -> error

        // Derived m = new Base(); -> error
    }
}
