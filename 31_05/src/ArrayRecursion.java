public class ArrayRecursion {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(sumArray(nums, 0));
    }
    public static int sumArray(int[] nums, int i){
        if(i==nums.length) return 0;
        return nums[i]+sumArray(nums, i+1);
    }
}
