package MOOCFI2.Part11.ProcessingFiles.SaveableDictionary;

import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

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

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }
}
