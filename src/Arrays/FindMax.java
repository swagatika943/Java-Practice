package Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 23, 56, 19};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
