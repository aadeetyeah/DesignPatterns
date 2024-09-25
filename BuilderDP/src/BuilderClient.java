public class BuilderClient {
    public static void main(String[] args) {
        DesktopDirector desktopDirector = new DesktopDirector();
        Desktop dellDesktop = desktopDirector.buildDesktop(new DellDesktopBuilder());


        Desktop hpDesktop = desktopDirector.buildDesktop(new HPDesktopBuilder());

        dellDesktop.display();
        System.out.println("\n\n--------------------------------------------------\n\n");
        hpDesktop.display();
    }
}
