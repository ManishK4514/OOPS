public class StaticVariables {
    // static varible
    static int a = m1();

    // static block
    static{
        System.out.println("Inside Static Block");
    }

    // static method
    static int m1(){
        System.out.println("from m1");
        return 20;
    }
    public static void main(String[] args) {
        System.out.println("Value of a: " + a);
        System.out.println("from main");
    }
}


/*
   Output:
   from m1
   Inside Static Block
   Value of a: 20
   from main
 */
