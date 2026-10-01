package Arrays.Level4;

public class MaximumDifference {
        public static void main(String[] args) {

            int[] arr = {10, 5, 30, 15, 40};

            int largest = arr[0];
            int smallest = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > largest) {
                    largest = arr[i];
                }

                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            int difference = largest - smallest;

            System.out.println("Maximum Difference = " + difference);
        }
}
