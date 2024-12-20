package GFGExample.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS.");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving file in Windows OS.");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS.");
    }
    
}
