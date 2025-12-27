package Test1;

public class Test2 {

    boolean mountainArray (int [] arr){
        int n = arr.length;
        int i = 0;
        while(i+1 < n && arr[i] < arr[i+1]) {
            i++;
        }
        if(i == n-1) return true;
        while(i+1 < n && arr[i] > arr[i+1]) {
            i++;
        }
        return i == n-1;
    }
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int [] arr = {1,2,3,4,5,2,1,0};
        System.out.println(ob.mountainArray(arr));
    }
}
