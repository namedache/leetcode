package test643;

/**
 * 643. 子数组最大平均数 I
 *
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * @author zhoukun
 */
public class Test {


    public static double findMaxAverage(int[] nums, int k) {
        double res = -Double.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i>nums.length-k){
                break;
            }
            double max = 0;
            double ress = 0;
            for (int j = i; j < k+i ; j++) {
                max += nums[j];
            }
            ress = max/k;
            res = Math.max(res,ress);
        }
        return res;
    }

    public static void main(String[] args) {
        double maxAverage = findMaxAverage(new int[]{-1}, 1);
        System.out.println(maxAverage);
    }




}
