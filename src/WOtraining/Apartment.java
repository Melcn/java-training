package WOtraining;

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;


    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }

    }

    public int priceDifference(Apartment compared) {
        return 0;
    }
}
