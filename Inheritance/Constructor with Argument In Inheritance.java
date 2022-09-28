class Base{
    int x; 
    Base(){
        System.out.println("I am the constructor of the base class");
    }
    Base(int x){
        System.out.println("Base class Constructor with value of x: " + x);
    }
}

class Derived extends Base{
    int y;
    Derived(){
        System.out.println("I am the constructor of the Derived class");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("Derived class contructor with value of y:"  + y);
    }
}

class ChildOfDerived extends Derived{
    int z;
    ChildOfDerived(){
        System.out.println("I am the constructor of the child of the Derived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("Child of Derived class contructor with value of z:"  + z);
    }
}

public class ConstructorWithArgumentsInInheritance {
    public static void main(String[] args) {
        // Base b = new Base(3);
        // Derived d = new Derived(3, 4);
        // ChildOfDerived c = new ChildOfDerived(3, 4, 5);
    }
}
