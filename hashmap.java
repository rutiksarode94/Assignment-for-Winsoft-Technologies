import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world! This is a sample string. Counting words in a string using HashMap.";
        HashMap<String, Integer> wordCountMap = countWords(str);
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            // Remove punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (word.length() > 0) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}
