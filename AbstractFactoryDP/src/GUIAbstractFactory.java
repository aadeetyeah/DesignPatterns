public class GUIAbstractFactory {

    //Factory of factories is AbstractFactory.

    public static IFactory createFactory(String osType){
        if(osType.equals("Windows")){
            return new WindowsFactory();
        } else if (osType.equals("Mac")) {
            return new MacFactory();
        }
        return null;
    }
}
