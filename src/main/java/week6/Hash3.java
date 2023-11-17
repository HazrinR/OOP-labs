package week6;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
class Dictionary{
    private HashMap<String, String> translations;
    public Dictionary(){
        this.translations=new HashMap<>();
    }
    public String translate(String word){
        return translations.getOrDefault(word, null);
    }
    public void add(String word, String translation){
        translations.put(word, translation);
    }
    public int amountOfWords(){
        return translations.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> translationList=new ArrayList<>();
        for(String key: translations.keySet()){
            String translation=key+" = "+ translations.get(key);
            translationList.add(translation);
        }
        return translationList;
    }}
    class TextUserInterface{
        private Scanner reader;
        private Dictionary dictionary;
        public TextUserInterface(Scanner reader, Dictionary dictionary){
            this.reader=reader;
            this.dictionary=dictionary;
        }
        public void start() {
            while (true) {
                System.out.print("Enter a command (add/translate/quit): ");
                String command = reader.nextLine();

                if (command.equals("quit")) {
                    System.out.println("Goodbye!");
                    break;
                } else if (command.equals("add")) {
                    System.out.print("Enter a word: ");
                    String word = reader.nextLine();
                    System.out.print("Enter a translation: ");
                    String translation = reader.nextLine();
                    dictionary.add(word, translation);
                } else if (command.equals("translate")) {
                    System.out.print("Enter a word to translate: ");
                    String wordToTranslate = reader.nextLine();
                    String translation = dictionary.translate(wordToTranslate);
                    System.out.println("Translation: " + (translation != null ? translation : "Not found"));
                } else {
                    System.out.println("Unknown statement");
                }
    }
}}
class Hash3 {
    public static void main(String[] args) {
        // Example usage of Dictionary
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));  // Output: monkey
        System.out.println(dictionary.translate("porkkana"));  // Output: null

        System.out.println(dictionary.amountOfWords());  // Output: 3

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());  // Output: 3 (unchanged)

        ArrayList<String> translations = dictionary.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        }

        // Example usage of TextUserInterface
        Scanner scanner = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(scanner, dictionary);
        ui.start();
    }
}
