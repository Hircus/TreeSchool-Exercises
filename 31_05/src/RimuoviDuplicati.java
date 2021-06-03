import java.util.Arrays;
import java.util.List;

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
// It doesn't matter what you leave beyond the returned length.

public class RimuoviDuplicati {
    public static void main(String[] args){
        int[] nums = new int[] {1,1,2};
        int len = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int j=0, n= nums.length;
        if (n==0 || n==1) return n;
        for (int i = 0; i < n-1; i++) {
            if(nums[i]!=nums[i+1]) nums[j++]=nums[i];
        }
        nums[j++]=nums[n-1];
        return j;
    }
}
