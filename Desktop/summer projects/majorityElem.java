import java.util.Arrays;

public class majorityElem {
    public int majorityElement(int[]nums){
        Arrays.sort(nums);
        int n= nums.length;
        return nums[n/2];
    }
}


