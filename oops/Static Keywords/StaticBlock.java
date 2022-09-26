public class StaticBlock {
    static int a = 5;
    static int b;

    // static block executes exactly once when the class is loaded for the first time.
    static{
        System.out.println("We are in static block");
        b = a * 4;
    }
    public static void main(String[] args) {
        System.out.println("We are in Main Method");
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}


/*
   Output:
   We are in static block
   We are in Main Method
   The value of a is: 5
   The value of b is: 20
*/