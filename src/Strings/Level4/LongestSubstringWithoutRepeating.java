package Strings.Level4;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String current = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (current.indexOf(ch) != -1) {
                    break;
                }
                current = current + ch;
                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        }
        System.out.println("Long substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
