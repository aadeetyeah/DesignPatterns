public class Client {
    public static void main(String[] args){

        ProductPrototype product1 = new Product("Laptop",3000);
        product1.display();
        System.out.println("---------------------Cloned below-----------------------");
        ProductPrototype product2 = product1.clone();
        product2.display();
    }
}
