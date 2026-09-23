package Arrays.Level3;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};
        System.out.println("Even Elements:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Elements:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
