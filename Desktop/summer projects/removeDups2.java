public class removeDups2 {
    public int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
    }
}
/*
 * this one is the same logic as remove dups but instead we start at 2 because we only want each unique number
 * that can repeat at most 2 times. So same exact code excpet we start the k from 2 cuz the first 2 indices will
 * be kept and then compare from the first 2 onwards.
 */

    
