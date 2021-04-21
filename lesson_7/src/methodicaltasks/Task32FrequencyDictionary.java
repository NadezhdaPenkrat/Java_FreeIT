package methodicaltasks;

import java.util.*;

/*
Имеется текст.
Следует составить для него
частотный словарь.
*/

public class Task32FrequencyDictionary {
    public static void main(String[] args) {

        String sentence = "The future belongs to those \n" +
                "who believe in their dreams. ";
        System.out.println(sentence);

        List<String> wordsInAsentence = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " !?.:(),;-{}\"\n");

        while (tokenizer.hasMoreTokens()) {
            wordsInAsentence.add(tokenizer.nextToken());
        }
        System.out.println();

        Map<String, Integer> dictionary = new HashMap<>();
        for (String string : wordsInAsentence) {
            if (dictionary.containsKey(string)) {
                int count = dictionary.get(string);
                dictionary.put(string, count + 1);
            } else {
                dictionary.put(string, 1);
            }
        }
        System.out.println(" Number of words in a sentence: " + wordsInAsentence.size());
        System.out.println();

        int countWords = 0;
        for (Map.Entry<String, Integer> map : dictionary.entrySet()) {
            System.out.println(map.getKey() + " - the word is found number of times: " + map.getValue());
            countWords += map.getValue();
        }
        System.out.println();
        System.out.println(" Number of words in Frequency Dictionary: " + countWords);
    }
}
