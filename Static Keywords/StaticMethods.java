public class StaticMethods {
    // static variable
    static int a = 10;

    // instance variable
    int b = 20;

    static void m1(){
        a = 20;
        System.out.println("from m1");
        // cannot make a static reference to the non-static method m2
        // m2(); // Compilation error
    
        // cannot use super or this keyword in static Context
        // System.out.println(super.a); --> Compilation error
    }

    // instance method
    void m2(){
        System.out.println("form m2");
    }
    public static void main(String[] args) {
        System.out.println("from main");

        // StaticMethods.m1(); --> this will work
        // StaticMethods.m2(); --> compilation error cannot make a static reference to non-static method
        m1();
    }
}
