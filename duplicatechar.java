import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        HashMap<Character, Integer> charCountMap = countCharacters(str);
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch) + " occurrences");
            }
        }
    }

    public static HashMap<Character, Integer> countCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        return charCountMap;
    }
}
