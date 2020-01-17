package Mianshi;

/**
 * @Classname oneTime
 * @Description 只出现一次的数字
 * @Date 2019-10-16 14:23
 * @Author zhoukun
 */
public class oneTime {


    //思路：根据异或运算的特点，
    // 相同的数字经过异或运算后结果为0，
    // 除单独出现一次的数字外，其他数字都是出现两次的
    // 那么这些数字经过异或运算后结果一定是0。
    // 而任何数字与0进行异或运算都是该数字本身。
    // 所以对数组所有元素进行异或运算，运算结果就是题目的答案。
    public int singleNumber(int[] nums){
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num = num^nums[i];
        }
        return num;
    }




}
