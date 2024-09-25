public class DellDesktopBuilder extends DesktopBuilder{

    @Override
    void buildMotherboard() {
        this.desktop.setMotherboard("Asus");
    }

    @Override
    void buildProcessor() {
        this.desktop.setProcessor("Intel I9");
    }

    @Override
    void buildMemory() {
        this.desktop.setMemory("Seagate 16 GB RAM");
    }

    @Override
    void buildStorage() {
        this.desktop.setStorage("Seagate 1 TB HDD");
    }

    @Override
    void buildGraphicsCard() {
        this.desktop.setGraphicsCard("NVIDIA GTX 3060 Ti");
    }
}
