//Concrete Factory

public class MacFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextbox() {
        return new MacTextbox();
    }
}
