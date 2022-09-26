class AnotherStatic{
    static int a = 5;
    static int b;

    // static block executes exactly once when the class is loaded for the first time.
    static{
        System.out.println("We are in static block");
        b = a * 4;
    }
}

public class StaticBlock2 {
    public static void main(String[] args) {
        // when the first object is created then static block executes exactly once.
        AnotherStatic obj = new AnotherStatic();
        System.out.println(AnotherStatic.a + " " + AnotherStatic.b);
        
        AnotherStatic.b += 2;
        AnotherStatic obj2 = new AnotherStatic(); // static block will not execute
        System.out.println(AnotherStatic.a  + " " + AnotherStatic.b);
    }
}

/*
   Output:-
   We are in static block
   5 20
   5 22
*/