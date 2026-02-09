package Divide_and_Conquer;
import java.util.Arrays;
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] n1 = new int [m];

        for(int i =0;i<m;i++){
            n1[i] = nums1[i];
        }



        int j = 0;
        int k = 0;
        int i = 0;

        while(i<m && j<n){
            if(n1[i]<=nums2[j]){
                nums1[k++] = n1[i++];
            }else{
                nums1[k++] = nums2[j++];
            }
        }

        while(i<m){
            nums1[k++] = n1[i++];
        }

        while(j<n){
            nums1[k++] = nums2[j++];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Merge ob = new Merge();
        int [] nums1 = {2,3,4,0,0,0};
        int [] nums2 = {4,6,7};
        ob.merge(nums1,3,nums2,3);
    }
}
