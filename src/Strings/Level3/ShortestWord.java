package Strings.Level3;
public class ShortestWord {
    public static void main(String[] args) {
        String str = "Java programming is interesting";
        String[] words = str.split(" ");
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println("Shortest Word = " + shortest);
    }
}
