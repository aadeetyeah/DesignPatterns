public class Client {

    public static void main(String args[]){
        IFactory iFactory = AbstractFurnitureFactory.createFactory("Victorian");
        Chair chair = iFactory.createChair();
        Table table = iFactory.createTable();
        chair.haveLegs();
        chair.sitOn();
        table.elevateHeight();
        table.keepThings();
    }
}
