abstract class BaseDecorator implements FoodItem{

    protected FoodItem foodItem;
    BaseDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }

}
