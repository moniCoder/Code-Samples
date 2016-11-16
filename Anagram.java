/*
 * Tells if two words are anagrams
 */

public class Anagram {
    
    public static void main(String[] args) {
        System.out.println("It's " + anagram("keepard","dsapeek") + " that these words are an anagram!");
    }
    
    public static boolean anagram(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        int len = s1.length();
        if (len != s2.length())
            return false;
        else {
            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) != s2.charAt(len-1-i))
                    return false;
            }
            return true;
        }
    }
    
}
