package Sorting;
import java.util.Arrays;
public class SortArray {

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }

    void mergeSort(int [] nums, int st, int end){
        if(st<end){
            int mid = st+(end-st)/2;
            mergeSort(nums,st,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,st,mid,end);
        }
    }

    void merge(int [] nums, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int [] temp1 = new int [n1];
        int [] temp2 = new int [n2];

        for(int i = 0;i<n1;i++){
            temp1[i] = nums[l+i];
        }

        for(int j = 0;j<n2;j++){
            temp2[j] = nums[mid+1+j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(temp1[i]<=temp2[j]){
                nums[k] = temp1[i];
                i++;
            }else{
                nums[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k++] = temp1[i++];
        }

        while(j<n2){
            nums[k++] = temp2[j++];
        }
    }

    public static void main(String[] args) {
        SortArray ob = new SortArray();
        int [] arr = {5,2,3,1};
        System.out.println(Arrays.toString(ob.sortArray(arr)));
    }
}
