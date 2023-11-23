package WOtraining;

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> Gifts = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        Gifts.add(gift);
    }

    public int totalWeight() {
        return 0;
    }
}
