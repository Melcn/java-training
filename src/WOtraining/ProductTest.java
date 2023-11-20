package WOtraining;

public class ProductTest {
    public static void main(String[] args) {

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        tapeMeasure.printProduct();
        plaster.printProduct();
        tyre.printProduct();
    }
}
