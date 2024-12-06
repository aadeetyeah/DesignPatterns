public class CheeseDecorator extends BaseDecorator{
    private double price;

    CheeseDecorator(FoodItem foodItem, double price){
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Extra Cheese";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice()+price;
    }
}
