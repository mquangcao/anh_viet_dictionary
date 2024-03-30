package utils;

import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Map;

import model.Word;

public class Helper {

    public static String UnicodeToASCII(String s) {
        String s1 = Normalizer.normalize(s, Normalizer.Form.NFKD);
        String regex = "[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+";
        String s2 = null;
        try {
            s2 = new String(s1.replaceAll(regex, "").getBytes("ascii"),
                    "ascii");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
        return s2;
    }

    public static ArrayList<String> recommendWords(String input, Map<String, Word> wordMap) {
        ArrayList<String> recommendedWords = new ArrayList<>();

        String regex = "^" + input + ".*";

        for (Map.Entry<String, Word> entry : wordMap.entrySet()) {
            String word = entry.getKey();
            if (word.matches(regex)) {
                recommendedWords.add(word);
            }
        }

        return recommendedWords;
    }

}