package Arrays.Level2;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int ser = 30;
        boolean get = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ser) {
                get = true;
                break;
            }
        }
        if (get)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
