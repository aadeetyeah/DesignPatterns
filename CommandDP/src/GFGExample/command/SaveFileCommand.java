package GFGExample.command;

import GFGExample.receiver.FileSystemReceiver;

public class SaveFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public SaveFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.saveFile();
    }
}
