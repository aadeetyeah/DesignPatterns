public class HPDesktopBuilder extends DesktopBuilder{

    @Override
    void buildMotherboard() {
        this.desktop.setMotherboard("Intel");
    }

    @Override
    void buildProcessor() {
        this.desktop.setProcessor("AMD Ryzen 7");
    }

    @Override
    void buildMemory() {
        this.desktop.setMemory("Intel 32 GB RAM");
    }

    @Override
    void buildStorage() {
        this.desktop.setStorage("Western Digital 2 TB SSD");
    }

    @Override
    void buildGraphicsCard() {
        this.desktop.setGraphicsCard("NVIDIA GEForce RTX");
    }
}

