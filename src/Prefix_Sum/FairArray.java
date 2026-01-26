package Prefix_Sum;

public class FairArray {

    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] prefEven = new int[n + 1];
        int[] prefOdd = new int[n + 1];

        int totalEven = 0, totalOdd = 0;

        // Build prefix sums
        for (int i = 0; i < n; i++) {
            prefEven[i + 1] = prefEven[i];
            prefOdd[i + 1] = prefOdd[i];

            if (i % 2 == 0) {
                prefEven[i + 1] += nums[i];
                totalEven += nums[i];
            } else {
                prefOdd[i + 1] += nums[i];
                totalOdd += nums[i];
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int leftEven = prefEven[i];
            int leftOdd = prefOdd[i];

            int rightEven = totalOdd - prefOdd[i + 1];
            int rightOdd = totalEven - prefEven[i + 1];

            if (leftEven + rightEven == leftOdd + rightOdd) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        FairArray obj = new FairArray();
        int[] nums = {2,1,6,4};
        System.out.println(obj.waysToMakeFair(nums));
    }
}
//important
