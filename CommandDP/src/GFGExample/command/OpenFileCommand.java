package GFGExample.command;

import GFGExample.receiver.FileSystemReceiver;

public class OpenFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}
