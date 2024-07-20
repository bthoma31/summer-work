import java.util.Arrays;

public class mergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j < n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
//pretty much since n is the length of the second array you can add that whole array to the first starting from the 
//mth element and then simply sort the first array using array.sort method