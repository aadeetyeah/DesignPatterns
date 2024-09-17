public class VictorianChair implements Chair{
    @Override
    public void haveLegs() {
        System.out.println("Victorian chair has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair.");
    }
}
