import java.util.Arrays;

public class Tartaglia {
    public static void main(String[] args){
        int n = 5;
        int[] nums = {1};
        int[] a = triangolo(nums, n , 0);
        System.out.println(Arrays.toString(a));
    }
    public static int[] triangolo(int[] nums, int n, int i){
        if(i==n){
            return nums;
        }else{
            int[] array = new int[nums.length+1];
            array[0] = 1;
            array[array.length-1] = 1;
            for (int j = 1; j < array.length-1; j++) {
                array[j] = nums[j] + nums[j-1];
            }
            return triangolo(array, n, i+1);
        }

    }
}
