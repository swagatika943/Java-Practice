package Strings.Level2;

public class LargestChar {
    public static void main(String[] args) {
        String str = "badce";
        char largest = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > largest) {
                largest = str.charAt(i);
            }
        }
        System.out.println("Largest Char = " + largest);
    }
}
