import subsystems.*;

//Facade class
public class ComputerSystemFacade {
    private CPU cpu;
    private Memory memory;
    private GPU gpu;

    private DiskDrive diskDrive;

    private NetworkInterface networkInterface;

    public ComputerSystemFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.gpu = new GPU();
        this.diskDrive = new DiskDrive();
        this.networkInterface = new NetworkInterface();
    }

    public void startComputer(){
        System.out.println("Starting the computer....");
        cpu.powerOn();
        memory.initialize();
        gpu.enableGraphics();
        diskDrive.bootFromDisk();
        networkInterface.connectToNetwork();
        System.out.println("Computer is ready to use.");
    }
}
