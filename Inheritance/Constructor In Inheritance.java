class Base{
    Base(){
        System.out.println("I am the constructor of the base class");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I am the constructor of the Derived class");
    }
}

public class ConstructorInInheritence {
    public static void main(String[] args) {
        Base b = new Base();
        Base k = new Derived();
        Derived d = new Derived();
    }
}
