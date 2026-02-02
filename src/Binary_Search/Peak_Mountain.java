package Binary_Search;

public class Peak_Mountain {

    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r =  arr.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid!=0 && mid!=r+1 && arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }else if(mid!=0 && arr[mid+1]<arr[mid]){
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Peak_Mountain ob = new Peak_Mountain();
        int [] arr = {0,2,1,0};
        System.out.println(ob.peakIndexInMountainArray(arr));
    }
}
