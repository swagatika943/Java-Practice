package Strings.Level2;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = result + ch;
            }
        }
        System.out.println("Result = " + result);
    }
}
