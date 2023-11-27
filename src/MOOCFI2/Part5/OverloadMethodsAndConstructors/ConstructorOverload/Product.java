package MOOCFI2.Part5.OverloadMethodsAndConstructors.ConstructorOverload;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name) {
        this.name = name;
        this.location = "etagere";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "etagere";
        this.weight = weight;
    }

    public void printProduct() {
        System.out.println(this.name + " " + this.location + " " + this.weight);
    }
}
