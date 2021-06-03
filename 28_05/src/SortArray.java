public class SortArray {
    public static void main(String[] args){
        int[] a = {5,4,3,2,1};
        int[] b = sortArray(a);
    }
    public static int[] sortArray(int[] nums) {
        int a = 0;
        for(int j=0; j<nums.length; j++){
            for(int i=0; i<nums.length; i++){
                if(i+1<nums.length && nums[i] > nums[i+1]){
                    a = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = a;
                }
            }
        }
        return nums;
    }
}
