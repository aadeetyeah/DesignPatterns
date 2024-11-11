package GFGExample.command;

import GFGExample.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}
