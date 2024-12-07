public class UberRide implements NavigationSystem{
    private String driverName;

    private NavigationImpl navigation;

    UberRide( String driverName){
        this.driverName = driverName;
    }

    public void setNavigation(NavigationImpl navigation){
        this.navigation = navigation;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("Uber ride with "+driverName+" to "+destination+" using ");
        navigation.navigateTo(destination);
    }
}
