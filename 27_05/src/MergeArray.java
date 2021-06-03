public class MergeArray {
    public static void main(String... args){
        int[] array1={1,2,3,0,0,0};
        int[] array2={2,5,6};

        merge(array1, 3, array2, 3);
        System.out.println("----------------");
        for(int x:array1)System.out.println(x);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] fondi= new int[n+m];
        int i=0;  //indice array fuso
        int n1=0; //indice primo array
        int n2=0; //indice secondo array

        // sapendo che sono due array ordinati è facile fare il confronto 1 a 1 degli elementi dei due array ed inserirli in un nuovo array di appoggio
        if(n!=0){
            while(i<n+m){
                if(nums1[n1]==0){
                    fondi[i]=nums2[n2];
                    n2++;
                    i++;
                }
                else if(nums1[n1]<nums2[n2]){
                    fondi[i]=nums1[n1];
                    n1++;
                    i++;
                }else{
                    fondi[i]=nums2[n2];
                    n2++;
                    i++;
                }
            }
            nums1=fondi;
            for(int x:nums1)System.out.println(x);
        }
    }

}
