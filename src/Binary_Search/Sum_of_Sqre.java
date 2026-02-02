package Binary_Search;

public class Sum_of_Sqre {

    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long) Math.sqrt(c);

        while(l<=r){
            long sum = l*l + r*r;
            if(sum==c) return true;
            if(sum>c){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }

    public boolean judgeSquareSum1(int c) {
        int n=(int)Math.sqrt(c)+1;
        long arr[] = new long[n];

        if(c==0 || c==1)return true;

        for(int i=0;i<n;i++)
        {
            arr[i]=(long)(i*i);
        }

        int low=0;
        int high=n-1;
        while(low<=high)
        {
            long sum=arr[low]+arr[high];
            if(sum==c)
                return true;
            else if(sum>c)
                high--;
            else
                low++;
        }
        return false;
    }


    public static void main(String[] args) {
        Sum_of_Sqre ob = new Sum_of_Sqre();
        System.out.println(ob.judgeSquareSum(5));
    }
}
