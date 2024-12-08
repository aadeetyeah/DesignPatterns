//Service class
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: "+ fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image: "+fileName);
    }
}
