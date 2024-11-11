package lectureexample;

import lectureexample.Command.ActionListenerCommand;
import lectureexample.Command.ActionOpen;
import lectureexample.Command.ActionSave;
import lectureexample.Receiver.Document;

public class ClientDemo {
    public static void main(String args[]){
        Document document = new Document(); //lectureexample.Receiver - who will perform actual action

        //Create concrete commands
        ActionListenerCommand open = new ActionOpen(document);
        ActionListenerCommand save = new ActionSave(document);

        //Invoker
        InvokerMenuOptions invokerMenuOptions = new InvokerMenuOptions();
        invokerMenuOptions.addCommand(open);
        invokerMenuOptions.addCommand(save);

        invokerMenuOptions.executeCommands();
    }
}
