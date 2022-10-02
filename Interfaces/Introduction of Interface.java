interface Bicylcle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a = 43;
    void applyHorn();
}
class AvonCycle implements Bicylcle, HornBicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Accelerator");
    }
    public void applyHorn(){
        System.out.println("Pee pee pee pee");
    }
}

public class IntroductionOfInterfaces {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);
        cycle1.speedUp(2);
        // System.out.println(cycle1.a); // allowed with warning
        System.out.println(Bicylcle.a); // allowed
        
        // We can't change a varible or as all varible of interface class is final
        // cycle1.a = 23; --error
        // System.out.println(cycle1.a);

        // System.out.println(cycle1.a); --> error because of Ambigous

        cycle1.applyHorn();
    }
}
