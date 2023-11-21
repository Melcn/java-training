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

        int n = this.getPricePerSquare() * this.getSquares();
        int nb = compared.getPricePerSquare() * compared.getSquares();
        int v = 0;

        if (n > nb) {
            v = n - nb;
        } else {
            v = nb - n;
        }
        return v;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return false;
    }
}
