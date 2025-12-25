package Stack;

public class LargestRectangle {

 //important
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int [] stack = new int [n+1];
            int maxarea = 0;
            int index = -1;

            for(int i=0;i<=n;i++){
                int currHeight = (i == n) ? 0 : heights[i];

                while(index!=-1 && (currHeight<heights[stack[index]])){
                    int h = heights[stack[index--]];
                    int left = index!=-1 ? stack[index] : -1;
                    int w = i - left -1;
                    maxarea = Math.max(h*w,maxarea);

                }
                stack[++index] = i;
            }

            // while (index != -1) {
            //     int h = heights[stack[index--]];
            //     int left = index != -1 ? stack[index] : -1;
            //     int w = n - left - 1;
            //     maxarea = Math.max(maxarea, h * w);
            // }
            return maxarea;
        }

    public static void main(String[] args) {
        LargestRectangle ob = new LargestRectangle();
        System.out.println(ob.largestRectangleArea(new int []{2,1,5,6,2,3}));
    }
}
