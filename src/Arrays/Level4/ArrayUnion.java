package Arrays.Level4;

public class ArrayUnion {
        public static void main(String[] args) {

            int[] arr1 = {10, 20, 30};
            int[] arr2 = {20, 30, 40};

            int[] union = new int[arr1.length + arr2.length];

            int count = 0;

            // Add elements of first array
            for (int i = 0; i < arr1.length; i++) {
                union[count] = arr1[i];
                count++;
            }

            // Add elements of second array if not already present
            for (int i = 0; i < arr2.length; i++) {

                boolean found = false;

                for (int j = 0; j < count; j++) {

                    if (arr2[i] == union[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    union[count] = arr2[i];
                    count++;
                }
            }

            System.out.println("Union:");

            for (int i = 0; i < count; i++) {
                System.out.print(union[i] + " ");
            }
        }
    }

