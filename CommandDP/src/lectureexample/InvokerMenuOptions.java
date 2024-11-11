package lectureexample;

import lectureexample.Command.ActionListenerCommand;

import java.util.ArrayList;
import java.util.List;

public class InvokerMenuOptions {

    private List<ActionListenerCommand> commands = new ArrayList<>();

    public void addCommand(ActionListenerCommand actionListenerCommand){
        commands.add(actionListenerCommand);
    }

    public void executeCommands(){
        for (ActionListenerCommand actionListenerCommand : commands){
            actionListenerCommand.execute();
        }
    }
}
