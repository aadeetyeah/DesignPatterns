public class Product extends ProductPrototype{

    private String name;
    private double price;

    public  Product(Product product){
        this.name = product.name;
        this.price = product.price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public ProductPrototype clone() {
        return new Product(this.name,this.price);
    }

    @Override
    public void display() {
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
    }
}
