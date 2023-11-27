package WOtraining.Part8;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, ArrayList<String>> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dictionary.keySet().contains(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            this.dictionary.put(word, new ArrayList<>());
            this.dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.keySet().contains(word)) {
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
