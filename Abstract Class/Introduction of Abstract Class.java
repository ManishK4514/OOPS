// We can't create a object of abstract class
abstract class Base{
    // If we declare a abstract method inside a class then we must declare class as abstract    
    abstract void greet();
    abstract void sayAnything();

    // we can declare its own method rather than abstract
    void meth(){
        System.out.println("This is the method of Base Class");
    }
}
class Derived extends Base{
    @Override
    void greet() {
        System.out.println("Good Morning");
    }
    // We have to override every method declared as abstract in the base class to make concrete class
    // otherwise it will throw an error
    // or if we don't want to do that we can declare aur derived class as abstract
    @Override
    void sayAnything(){
        System.out.println("Hello World");
    }
    void meth1(){
        System.out.println("This is the method 1 of Derived Class");
    }
}
abstract class Derived2 extends Base{
    @Override
    void greet(){
        System.out.println("Namaste");
    }
    // if we don't want to do that we can declare aur derived2 class as abstract.
}
public class IntroductionOfAbstractClass {
    public static void main(String[] args) {
        // Base b = new Base(); --> error
        // We can't create a object of abstract class

        Derived d = new Derived();
        d.greet();
        d.sayAnything();
      
        // Derived2 k = new Derived2(); --> error
        // We can't create a object of abstract class

        Base obj = new Derived(); //--> Allowed
        obj.greet();
        obj.sayAnything();
        obj.meth();
        // obj.meth1(); --> error
    }
}
