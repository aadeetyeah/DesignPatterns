//Director class
//Director has an Association relationship with Desktop Builder
//DesktopBuilder can be of any type. HP or Dell.

public class DesktopDirector {

    public Desktop buildDesktop(DesktopBuilder desktopBuilder){
        desktopBuilder.buildMotherboard();
        desktopBuilder.buildMemory();
        desktopBuilder.buildGraphicsCard();
        desktopBuilder.buildProcessor();
        desktopBuilder.buildStorage();
        Desktop desktop = desktopBuilder.getDesktop();
        return desktop;
    }
}
