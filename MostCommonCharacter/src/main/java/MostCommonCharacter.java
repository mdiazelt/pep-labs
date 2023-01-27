import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        Map<Character, Integer> charcterCount = new HashMap<>();

        for (int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if(!charcterCount.containsKey(c)){
                charcterCount.put(c, 0);    
            }
            charcterCount.put(c, charcterCount.get(c) + 1);
            
        } 
        int count = 0;
        char c= str.charAt(0);
        for(Map.Entry<Character, Integer> entry : charcterCount.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                c = entry.getKey();
            }

        }
        return c;
    }
    
}
