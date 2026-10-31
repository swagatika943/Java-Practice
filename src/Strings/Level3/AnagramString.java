package Strings.Level3;
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean anagram = true;

        if (str1.length() != str2.length()) {
            anagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                int count1 = 0;
                int count2 = 0;
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i) == str1.charAt(j)) {
                        count1++;
                    }
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count2++;
                    }
                }
                if (count1 != count2) {
                    anagram = false;
                    break;
                }
            }
        }
        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}