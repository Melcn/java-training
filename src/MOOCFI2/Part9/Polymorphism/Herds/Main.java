package MOOCFI2.Part9.Polymorphism.Herds;

public class Main {
    public static void main(String[] args) {

        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        System.out.println("\n Moving...");
        herd.move(23, 98);
        System.out.println(herd);
    }
}
