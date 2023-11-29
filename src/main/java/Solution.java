import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    newArray = new int[]{i, j};
                    break;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,7,11,15}, 9)));
        Solution solution1 = new Solution();
        System.out.println(Arrays.toString(solution1.twoSum(new int[]{3,2,4}, 6)));
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.twoSum(new int[]{3,3}, 6)));
    }
}
