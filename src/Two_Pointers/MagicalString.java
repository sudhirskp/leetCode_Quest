package Two_Pointers;

public class MagicalString {

    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        int[] arr = new int[n + 2];
        arr[0] = 1; arr[1] = 2; arr[2] = 2;

        int ind = 2;
        int num = 1;
        int count = 1;
        int len = 3;

        while (len < n) {
            for (int i = 0; i < arr[ind]; i++) {
                arr[len] = num;
                if (num == 1 && len < n) count++;
                len++;
            }
            num = 3 - num;
            ind++;
        }
        return count;
    }

    public static void main(String[] args) {
        MagicalString ob = new MagicalString();
        System.out.println(ob.magicalString(15));
    }
}

