public class Client {
    public static void main(String[] args) {
        UberRide uberRide = new UberRide("Aditya");
        GoogleMaps googleMaps = new GoogleMaps();
        AppleMaps appleMaps = new AppleMaps();
        uberRide.setNavigation(appleMaps);
        uberRide.navigate("Mumbai");
    }
}
