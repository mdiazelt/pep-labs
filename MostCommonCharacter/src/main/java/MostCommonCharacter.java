import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        //char countChar = ' ';
        //int counter = 0;
        int[] ascii_count = new int[128];  
        //HashMap<Character,Integer> count = new HashMap<Character,Integer>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch < 128) {
                ascii_count[ch]++;
            }
        }
        return ' ';
    }
}
