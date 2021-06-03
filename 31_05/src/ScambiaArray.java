public class ScambiaArray {

    //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    public static void main(String[] args){
        int[] nums = new int[] {2,5,1,3,4,7};
        int n = 3;            //[2,3,5,4,1,7]
        int[] nums2 = shuffle(nums, n);
    }
    public static int[] shuffle(int[] nums, int n) {
        int j=n, k=0;
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < n; i++) {
            nums2[k++]=nums[i];
            nums2[k++]=nums[j++];
        }
        return nums2;
    }
}
