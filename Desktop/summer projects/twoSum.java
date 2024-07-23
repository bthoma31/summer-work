import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,target-nums[i]};
            }
        }
        return new int[0];
    }
}
/*make a hashmap to store the nums and then search through the first array to find if there is a number that is that
 * spot in the index minus the target which would mean that those two indexes is what we are looking for. If the case is met
 * add those indecies into a new int array otherwise print empty array
 */