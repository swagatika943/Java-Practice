package Strings.Level4;

public class CheckRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
        } else {
            String combined = str1 + str1;
            if (combined.contains(str2)) {
                System.out.println("Strings are rotations");
            } else {
                System.out.println("Not a rotation");
            }
        }
    }
}
