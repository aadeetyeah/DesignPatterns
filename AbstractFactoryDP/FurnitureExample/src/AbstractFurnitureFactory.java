public class AbstractFurnitureFactory {

    public static IFactory createFactory(String furnitureType){
        if(furnitureType.equals("Modern")){
            return new ModernFactory();
        } else if (furnitureType.equals("Victorian")) {
            return new VictorianFactory();
        }else {
            return null;
        }
    }
}
