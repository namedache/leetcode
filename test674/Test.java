package test674;

/**
 * 674. 最长连续递增序列
 * 给定一个未经排序的整数数组，找到最长且连续的的递增序列，并返回该序列的长度。
 *
 *
 * 输入: [1,3,5,4,7]
 * 输出: 3
 * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zhoukun
 */
public class Test {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j-1]<nums[j]){
                    max++;
                } else {
                    break;
                }
            }
            if (max>res)
            {
                res = max;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int lengthOfLCIS = findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        System.out.println(lengthOfLCIS);
    }

}
