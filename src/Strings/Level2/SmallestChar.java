package Strings.Level2;

public class SmallestChar {
    public static void main(String[] args) {
        String str = "badce";
        char smallest = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < smallest) {
                smallest = str.charAt(i);
            }
        }
        System.out.println("Smallest Char = " + smallest);
    }
}
