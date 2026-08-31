package Arrays.Level1;

public class SearchValue {
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 5, 9};
        int target = 5;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = true;
                break; // Stop loop early if found
            }
        }
        System.out.println("Target found: " + found);
    }
}
