public class SauceDecorator extends BaseDecorator{

    private double price;

    SauceDecorator(FoodItem foodItem,double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " extra Sauce";
    }

    @Override
    public double getPrice() {
        return price+ foodItem.getPrice();
    }
}
