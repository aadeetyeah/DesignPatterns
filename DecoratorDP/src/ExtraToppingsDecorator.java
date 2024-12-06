public class ExtraToppingsDecorator extends BaseDecorator{


    private double price;

    ExtraToppingsDecorator(FoodItem foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " extra toppings";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + price;
    }
}
