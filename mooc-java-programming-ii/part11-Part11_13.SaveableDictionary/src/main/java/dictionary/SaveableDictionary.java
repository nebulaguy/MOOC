package dictionary;

import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileWriter;



public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public boolean load() {
        try (Scanner filereader = new Scanner(Paths.get(this.file))) {
            while(filereader.hasNextLine()) {
                String line = filereader.nextLine();
                String[] parts = line.split(":");
                
                this.dictionary.putIfAbsent(parts[0], parts[1]);  
            }  
            return true;
                     
        } catch(Exception e) { 
            return false;
        }                        
    }
    
    public boolean save() {
        try(FileWriter writer = new FileWriter(this.file)) {           
            for(String key: this.dictionary.keySet()) {
                writer.write(key + ":" + this.dictionary.get(key) + "\n");
            }
            
            writer.flush();
            return true;
            
        } catch(Exception e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {        
        String translation = null;

        if (this.dictionary.containsKey(word)) {
            translation = this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    translation = key;
                }
            }
        }

        return translation;
                       
    }
    
    public void delete(String word) {  
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }

        if (this.dictionary.containsValue(word)) {
            String keyToRemove = null;

            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyToRemove = key;
                }
            }

            this.dictionary.remove(keyToRemove, word);
        }
    }    
}
