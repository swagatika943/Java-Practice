package Strings.Level2;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(ch);
            }
        }
    }
}
