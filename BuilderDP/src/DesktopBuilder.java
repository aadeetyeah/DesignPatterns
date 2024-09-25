//AbstractBuilder class

public abstract class DesktopBuilder {

    //Compostion relation between DesktopBuilder and Desktop(Product) class
    Desktop desktop = new Desktop();

    abstract void buildMotherboard();
    abstract void buildProcessor();

    abstract void buildMemory();

    abstract void buildStorage();

    abstract void buildGraphicsCard();

    public Desktop getDesktop() {
        return desktop;
    }

}
