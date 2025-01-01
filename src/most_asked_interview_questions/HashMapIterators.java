package most_asked_interview_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterators {
    public static void main(String[] args){
        String str = "run away from coding run";
        Map<Integer, Integer> testMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> itr : testMap.entrySet()){
            System.out.println(itr.getKey()+" "+itr.getValue());
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = testMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
