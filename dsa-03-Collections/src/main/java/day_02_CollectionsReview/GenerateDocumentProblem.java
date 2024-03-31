package day_02_CollectionsReview;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocumentProblem {

    public static void main(String[] args) {
        String list = "!veDJaCyd vaeo perelo xw";
        String document = "Cydeo Java Developer!";
        System.out.println(generateDocumentBruteForce(list, document));
        System.out.println(generateDocumentOptimal(list, document));
    }

    public static boolean generateDocumentBruteForce(String list, String document){
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentCharFreq = countCharFreq(character, document);
            int charListFreq = countCharFreq(character, list);
            if (documentCharFreq > charListFreq){
                return false;
            }
        }
        return true;
    }

    public static int countCharFreq(Character character, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean generateDocumentOptimal(String list, String document){

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < list.length(); i++) {
            map.put(list.charAt(i), map.getOrDefault(list.charAt(i), 0) + 1);
        }

        // iterate doc string and update char freq from map
        for (int i = 0; i < document.length(); i++) {
            if (!map.containsKey(document.charAt(i)) || map.get(document.charAt(i)) == 0) return false;
            map.put(document.charAt(i), map.get(document.charAt(i)) - 1);
        }

        return true;
    }
}
