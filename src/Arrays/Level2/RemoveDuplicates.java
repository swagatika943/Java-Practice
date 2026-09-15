package Arrays.Level2;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10};
        int[] uni = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean dupli = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == uni[j]) {
                    dupli = true;
                    break;
                }
            }
            if (!dupli) {
                uni[count] = arr[i];
                count++;
            }
        }
        System.out.println("Arrays after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(uni[i] + " ");
        }
    }
}