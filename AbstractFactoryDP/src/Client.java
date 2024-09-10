import java.util.Scanner;

public class Client {

    public static void main(String args[]){
        System.out.println("Enter Machine OS:");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        scanner.close();

        IFactory iFactory = GUIAbstractFactory.createFactory(osType);

        ITextBox iTextBox = iFactory.createTextbox();
        IButton iButton = iFactory.createButton();
        iButton.press();
        iTextBox.setText();
    }
}
