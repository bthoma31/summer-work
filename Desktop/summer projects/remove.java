public class remove {
    public int removeElement(int[] nums, int val) {
       int index=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
       }
       return index;
    }
}
/*this one a simple explanation we instatiate a index variable that we will use to hold the numbers that are not equal to 
 * the value we look for. Then when we loop through the array we see if any index is equal to the target value
 * if it does not equal to the target we move that up in the array and the target would not be in the array
 * then we simply return the index variable which holds the new array without the target element
 */
