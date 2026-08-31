package Arrays.Level2;

public class ElementIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int ser = 30;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ser) {
                System.out.println("Index = " + i);
                break;
            }
        }
    }
}
