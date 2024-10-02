public class DellDesktopBuilder extends DesktopBuilder{

    public DellDesktopBuilder(){
        desktop = new Desktop();
    }

    @Override
    DesktopBuilder buildMotherboard() {
        this.desktop.setMotherboard("Asus");
        return this;
    }

    @Override
    DesktopBuilder buildProcessor() {
        this.desktop.setProcessor("Intel I9");
        return this;
    }

    @Override
    DesktopBuilder buildMemory() {
        this.desktop.setMemory("Seagate 16 GB RAM");
        return this;
    }

    @Override
    DesktopBuilder buildStorage() {
        this.desktop.setStorage("Seagate 1 TB HDD");
        return this;
    }

    @Override
    DesktopBuilder buildGraphicsCard() {
        this.desktop.setGraphicsCard("NVIDIA GTX 3060 Ti");
        return this;
    }
}
