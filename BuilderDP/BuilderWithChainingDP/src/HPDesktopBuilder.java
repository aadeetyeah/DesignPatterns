public class HPDesktopBuilder extends DesktopBuilder{

    HPDesktopBuilder(){
        desktop = new Desktop();
    }
    @Override
    DesktopBuilder buildMotherboard() {
        this.desktop.setMotherboard("Intel");
        return this;
    }

    @Override
    DesktopBuilder buildProcessor() {
        this.desktop.setProcessor("AMD Ryzen 7");
        return this;
    }

    @Override
    DesktopBuilder buildMemory() {
        this.desktop.setMemory("Intel 32 GB RAM");
        return this;
    }

    @Override
    DesktopBuilder buildStorage() {
        this.desktop.setStorage("Western Digital 2 TB SSD");
        return this;
    }

    @Override
    DesktopBuilder buildGraphicsCard() {
        this.desktop.setGraphicsCard("NVIDIA GEForce RTX");
        return this;
    }
}

