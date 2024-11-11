package lectureexample.Command;

import lectureexample.Receiver.Document;

public class ActionOpen implements ActionListenerCommand{
    private Document document;

    public ActionOpen(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
