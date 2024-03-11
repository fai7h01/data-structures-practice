import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Solution2{
    public static void main(String[] args) {

        int[] nums = {2,7,11,14};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    private static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};


    }
}
