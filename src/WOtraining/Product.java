package WOtraining;

public class Product {
    private String initialName;
    private double initialPrice;
    private int initialQuantity;

    public Product (String initialName, double initialPrice, int initialQuantity){
        this.initialName = initialName;
        this.initialQuantity = initialQuantity;
        this.initialPrice = initialPrice;
    }

    public void printProduct() {
        System.out.println(this.initialName + " " + this.initialPrice + " " + this.initialQuantity);
    }
}
