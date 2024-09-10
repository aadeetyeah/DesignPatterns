//Concrete Factory

public class WindowsFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextbox() {
        return new WindowsTextbox();
    }
}
