package GFGExample;

import GFGExample.command.CloseFileCommand;
import GFGExample.command.OpenFileCommand;
import GFGExample.command.SaveFileCommand;
import GFGExample.receiver.FileSystemReceiver;
import GFGExample.receiver.UnixFileSystemReceiver;
import GFGExample.receiver.WindowsFileSystemReceiver;

public class ClientDemo {

    public static void main(String args[]){
        String os = "unix";
        FileSystemReceiver fs = null;
        if(os.equals("windows")){
            fs = new WindowsFileSystemReceiver();
        }else {
            fs = new UnixFileSystemReceiver();
        }

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        SaveFileCommand saveFileCommand = new SaveFileCommand(fs);
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        fileInvoker.setCommand(saveFileCommand);
        fileInvoker.execute();

        fileInvoker.setCommand(closeFileCommand);
        fileInvoker.execute();
    }
}
