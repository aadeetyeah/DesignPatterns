public class ModernChair implements Chair{
    @Override
    public void haveLegs() {
        System.out.println("Modern Chair has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair.");
    }
}
