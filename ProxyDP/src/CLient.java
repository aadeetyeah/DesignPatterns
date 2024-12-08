public class CLient {
    public static void main(String[] args) {
        Image proxy = new ImageProxy("high_res_image.jpg");

        proxy.display(); //loading on demand. First time.

        proxy.display(); //Image is loaded from the cached.
    }
}
