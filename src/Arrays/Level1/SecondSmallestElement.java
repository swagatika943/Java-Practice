package Arrays.Level1;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15};
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
    }
}
