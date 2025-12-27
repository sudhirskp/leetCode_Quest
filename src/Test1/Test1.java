package Test1;
import java.util.Arrays;
public class Test1 {


        public int[] plusOne(int[] digits) {
            int n = digits.length;
            int i = n-1;

            while(i >= 0 && digits[i] == 9) {
                digits[i--] = 0;
            }

            if(i < 0) {
                int[] newDigits = new int[n+1];
                newDigits[0] = 1;
                return newDigits;
            } else {
                digits[i]++;
            }

            return digits;
        }

    public static void main(String[] args) {
        Test1 ob = new Test1();
        System.out.println(Arrays.toString(ob.plusOne(new int []{1,2,3})));
        System.out.println(Arrays.toString(ob.plusOne(new int []{9,9,9})));
        System.out.println(Arrays.toString(ob.plusOne(new int []{9})));
        System.out.println(Arrays.toString(ob.plusOne(new int []{0})));
        System.out.println(Arrays.toString(ob.plusOne(new int []{1,2,9})));
        System.out.println(Arrays.toString(ob.plusOne(new int []{4,3,2,1})));
    }
}
