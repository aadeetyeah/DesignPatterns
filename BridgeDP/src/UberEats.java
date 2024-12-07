public class UberEats implements NavigationSystem{

    private String restaurantName;

    private NavigationImpl navigation;

    UberEats(NavigationImpl navigation, String restaurantName){
        this.restaurantName = restaurantName;
    }

    public void setNavigation(NavigationImpl navigation){
        this.navigation = navigation;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("Uber eats delivery from "+restaurantName+" to "+destination+" using ");
        navigation.navigateTo(destination);
    }
}
