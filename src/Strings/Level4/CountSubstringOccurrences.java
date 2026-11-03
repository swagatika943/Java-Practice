package Strings.Level4;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";
        String sub = "java";
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
}
