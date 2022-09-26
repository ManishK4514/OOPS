class Employee{
    // instance variable
    int id;
    int salary;
    String name;
    // Default Constructor
    Employee(){
        // when we do not specify our constructor then java internally call their default constructor. 
    }
    // constructor Overloading

    // Paramitirized constructor
    Employee(int id, int salary, String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Copy Constructor --> copy the value of another object
    Employee(Employee ref){
        id = ref.id;
        salary = ref.salary;
        name = ref.name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee obj = new Employee(3, 1500, "Manish");
        System.out.println("Properties of the 1st object: ");
        System.out.println(obj.id);
        System.out.println(obj.salary);
        System.out.println(obj.name);
        System.out.println();
        
        System.out.println("Properties of the 2nd object: ");
        Employee obj2 = new Employee();
        System.out.println(obj2.id);
        System.out.println(obj2.salary);
        System.out.println(obj2.name);
        System.out.println();

        System.out.println("Properties of the 3rd object: ");
        Employee obj3 = new Employee(12, "Ritik3");
        System.out.println(obj3.id);
        System.out.println(obj3.salary);
        System.out.println(obj3.name);
        System.out.println();
        
        System.out.println("Properties of the 4th object: ");
        Employee obj4 = new Employee(obj); // passing object
        System.out.println(obj4.id);
        System.out.println(obj4.salary);
        System.out.println(obj4.name);
    }
}
