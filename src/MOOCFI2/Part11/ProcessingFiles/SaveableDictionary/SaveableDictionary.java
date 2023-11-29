package MOOCFI2.Part11.ProcessingFiles.SaveableDictionary;

import java.io.File;
import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String fileName) {
        this.dictionary = new HashMap<>();
        this.file = new File(fileName);
    }
}
