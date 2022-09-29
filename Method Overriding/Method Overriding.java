class Parent{
    void meth1(){
        System.out.println("We are Inside the method 1 of Parent class");
    }
    void meth2(){
        System.out.println("We are Inside the method 2 of Parent class");
        meth3();
    }
    private void meth3(){
        System.out.println("We are Inside the method 3 of Parent class");
    }
    static void meth4(){
        System.out.println("This is the static method of Parent class");
    }
    final void meth5(){
        System.out.println("This is the final method of Parent class");
    }
}

class Child extends Parent{
    @Override
    void meth1(){
        System.out.println("We are Inside the method 1 of Child class");
    }
    @Override
    // Default method of parent class can be overriden by declaring public.
    public void meth2(){
        System.out.println("We are Inside the method 2 of Child class");
        meth3();
    }
    // new meth3() method
    // unique to Child class
    private void meth3(){
        System.out.println("We are Inside the method 3 of Child class");
    }
    // @Override --> We cannot override static method,we can only declare new as same as parent
    static void meth4(){
        System.out.println("This is the static method of Child class");
    }
    // We cannot @Override final method.
    // final void meth5(){
    //     System.out.println("This is the final method of Child class");
    // }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.meth1();
        p.meth2();
        Child c = new Child();
        c.meth1();
        c.meth2();
    }
}
