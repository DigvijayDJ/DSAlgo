package most_asked_interview_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CountWords {
    public static void main(String[] args){
        String str = "run away from coding run";
        wordCount(str);
    }

    public static Map<String, Integer> wordCount(String s){
        Map<String, Integer> wordCount = new HashMap<>();
        String[] strs = s.split(" ");
        for (String s1 : strs){
            wordCount.put(s1, wordCount.getOrDefault(s1, 0)+1);
        }
        System.out.println(wordCount);
        return wordCount;
    }
}
