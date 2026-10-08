package Strings.Level2;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abcde";
        boolean unique = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                break;
            }
        }
        if (unique) {
            System.out.println("All characters are unique");
        } else {
            System.out.println("Characters are not unique");
        }
    }
}
