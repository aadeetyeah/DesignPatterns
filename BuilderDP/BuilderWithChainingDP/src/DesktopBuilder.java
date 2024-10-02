//AbstractBuilder class

public abstract class DesktopBuilder {

    //Compostion relation between DesktopBuilder and Desktop(Product) class
    protected Desktop desktop;

    abstract DesktopBuilder buildMotherboard();
    abstract DesktopBuilder buildProcessor();

    abstract DesktopBuilder buildMemory();

    abstract DesktopBuilder buildStorage();

    abstract DesktopBuilder buildGraphicsCard();

    Desktop build(){
        return desktop;
    }

    public Desktop getDesktop() {
        return desktop;
    }

}
