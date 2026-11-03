package Strings.Level4;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "banana";
        char remove = 'a';
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
