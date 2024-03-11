import java.util.Arrays;

public class TwoSum_Solution1 {
    public static void main(String[] args) {

        int[] nums = {2,8,11,7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    private static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {   // time complexity O(n*n)
            for (int j = 0; j < nums.length; j++) {
                if (i != j){
                    if (nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{};

    }

}
