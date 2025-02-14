import java.util.*;

public class RepeatedWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence here : ");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        sc.close();
    }
}