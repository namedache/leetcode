/**
 * @Classname solution
 * @Description TODO
 * @Date 2019-01-03 10:07
 * @Author zhoukun
 */
public class Solution {

    public static int plusOne(int[] digits) {

        int len = digits.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result = +digits[i] * (len - 1 - i) * 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};


        System.out.println(plusOne(digits));


    }


}
