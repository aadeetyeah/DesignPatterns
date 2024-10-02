//Director class
//Director has an Association relationship with Desktop Builder
//DesktopBuilder can be of any type. HP or Dell.

public class DesktopDirector {

    public Desktop buildDesktop(DesktopBuilder desktopBuilder){
        Desktop desktop = desktopBuilder.buildGraphicsCard().buildStorage().buildMemory().buildMotherboard().buildProcessor()
                .build();
        return desktop;
    }
}

