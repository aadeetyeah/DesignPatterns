public interface IFactory {
    IButton createButton();
    ITextBox createTextbox();

    //These two methods have to be implemented by the Concrete Factory
}
