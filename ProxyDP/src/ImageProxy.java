//Proxy class
public class ImageProxy implements Image{

    private Image realImage;

    private String fileName;

    public ImageProxy(String fileName){
        this.fileName = fileName;
        this.realImage = null;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
