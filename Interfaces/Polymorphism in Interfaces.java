class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling on " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

interface Camera{
    // we can decalre a private method in interface But we can't access directly with the object, but we can call inside the default method.
    private void greet(){
        System.out.println("Hello World");
    }
    static void photo(){
        System.out.println("my phonto..");
    }
    void takingSnap();
    void recordingIn4k();
    default void takePhoto(){
        // calling private method
        greet();
        System.out.println("Taking Photo...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class SmartPhone extends cellPhone implements Camera, Wifi{
    public void takingSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordingIn4k(){
        System.out.println("Recording in 4k...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] newtworkList = {"Manish4514", "CrazyWifi", "Devil", "Ravan"};
        return newtworkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    // @Override
    // public void takePhoto() {
    //     System.out.println("Taking snap & then Photo...");
    // }
}
public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        Wifi w = new SmartPhone(); // we can only use wifi method 
        w.connectToNetwork("Manish4514"); // --> Allowed
        // w.takingSnap(); --> not allowed 

        // SmartPhone realme = new SmartPhone();  --> Allowed all methods
        
        // realme.takingSnap();
        // realme.recordingIn4k();
        // realme.connectToNetwork("Manish4514");
        // realme.takePhoto();
        // String[] ar = realme.getNetworks();
        // for(String str: ar){
        //     System.out.print(str + " ");
        // }
    }
}
