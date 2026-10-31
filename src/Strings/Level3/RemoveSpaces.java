package Strings.Level3;
public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }
        System.out.println("Res = " + result);
    }
}
