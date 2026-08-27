package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.print("Reversed array: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
