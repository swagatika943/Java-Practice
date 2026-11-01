package Strings.Level3;

public class SecondLargCharacter {
    public static void main(String[] args) {
        String str = "abcde";
        char large = str.charAt(0);
        char seclarge = '\0';
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > large) {
                seclarge = large;
                large = ch;
            }
            else if (ch > seclarge && ch != large) {
                seclarge = ch;
            }
        }
        if (seclarge == '\0') {
            System.out.println("Sec large char not found");
        } else {
            System.out.println("Sec Large Char = " + seclarge);
        }
    }
}
