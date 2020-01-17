package test11;

/**
 * @Classname Eleven
 * @Description TODO
 * @Date 2019-09-10 14:01
 * @Author zhoukun
 */
public class Eleven {

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }



        return maxarea;
    }






}
