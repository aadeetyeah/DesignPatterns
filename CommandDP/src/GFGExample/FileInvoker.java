package GFGExample;

import GFGExample.command.Command;

public class FileInvoker {

    private Command command;

    public FileInvoker(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }

    public void setCommand(Command command){
        this.command = command;
    }
}
