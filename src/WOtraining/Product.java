package WOtraining;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, double location, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = location;
    }

    public void printProduct() {
        System.out.println(this.name + " " + this.location + " " + this.weight);
    }
}
