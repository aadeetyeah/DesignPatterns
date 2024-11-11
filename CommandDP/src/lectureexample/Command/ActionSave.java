package lectureexample.Command;

import lectureexample.Receiver.Document;

public class ActionSave implements ActionListenerCommand{

    private Document document;

    public ActionSave(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
