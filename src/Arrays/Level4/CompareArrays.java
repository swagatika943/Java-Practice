package Arrays.Level4;

public class CompareArrays {
        public static void main(String[] args) {

            int[] arr1 = {10, 20, 30};
            int[] arr2 = {10, 20, 30};

            boolean equal = true;

            if (arr1.length != arr2.length) {

                equal = false;

            } else {

                for (int i = 0; i < arr1.length; i++) {

                    if (arr1[i] != arr2[i]) {
                        equal = false;
                        break;
                    }
                }
            }

            if (equal) {
                System.out.println("Arrays are Equal");
            } else {
                System.out.println("Arrays are Not Equal");
            }
        }
    }
