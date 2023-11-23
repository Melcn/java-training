package WOtraining;

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int tw = 0;
        for (Gift g : gifts
        ) {
            tw = +g.getWeight();
        }
        return tw;
    }
}
