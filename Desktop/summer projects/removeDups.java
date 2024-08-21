public class removeDups {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
/*in this one we first instiate the int k which is 1 because we want to start comparing from the 1st index
not from the 0th index. This is becuase we are comparing each index to it's previous. The for loop loops from the 
first index to the end. Now the if statement only runs if the index we are on and the index before it are not equal
this means if they are equal we do nothing and loop to the next one. When they are equal the k index gets replaced
by the one that is not equal or the other unique number that comes in the loop.This works because the loop keeps looping till
it finds a unique number while the k stays at the duplicate until it is replaced and then gets increased by 1. Finally the
k is returned to see how many times a unqiue number was found.
 */