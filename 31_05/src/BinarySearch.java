import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        System.out.println(binarySearch(a, 10));
    }
    public static boolean binarySearch(int[] nums, int number){
        int[] half = new int[nums.length/2];
        int low = nums[0];
        int high = nums[nums.length-1];
        int mid = nums[nums.length/2];
        if(low==number || high==number || mid==number) return true;
        else if(high==mid) return false;
        else if(number>nums[mid]) half = Arrays.copyOfRange(nums, mid, nums.length);
        else if(number<nums[mid]) half = Arrays.copyOfRange(nums, 0, mid);
        return binarySearch(half, number);
    }
}
