import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args){
        int[] nums1=new int[] {0};
        int[] nums2=new int[] {1};
        int m=0;
        int n=1;



        if(m==0) nums1=nums2;
        else{
            for(int i=m+n-1; i>0; i--){
                if(nums1[i]==0){
                    nums1[i]=nums2[i-n];
                }
                if(nums1[i-1]>nums1[i]){
                    int a=nums1[i-1];
                    nums1[i-1]=nums1[i];
                    nums1[i]=a;
                }
            }

        }

    }
}
