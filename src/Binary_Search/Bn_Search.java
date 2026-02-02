package Binary_Search;

public class Bn_Search {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int l=0, r = n-1;

        return bnsearch(nums,l,r,target);
    }

    public int bnsearch(int [] arr , int l , int r , int target){
        int mid = (r+l)/2;
        if(l>r){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return bnsearch(arr,l,mid-1,target);
        }else{
            return bnsearch(arr,mid+1,r,target);
        }
    }

    public static void main(String[] args) {
        Bn_Search ob = new Bn_Search();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ob.search(arr, 5));
    }
}
