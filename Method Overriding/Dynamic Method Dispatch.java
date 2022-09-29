class Phone{
    void greet(){
        System.out.println("Hello World");
    }
    void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    @Override
    void on(){
        System.out.println("Turning on SmartPhone...");
    }
    void playMusic(){
        System.out.println("Playing music...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on(); // Allowed
        // obj.playMusic(); -> error
        // We have created object of smartphone using the reference of phone so we can only use those methods which are in Phone class. but we can also use those method which is..
        // Overriden in Smartphone 
        // and will call the method of SmartPhone

        // obj.playMusic(); --> Not Allowed

        // SmartPhone obj2 = new Phone();  --> Not Allowed
    }
}
