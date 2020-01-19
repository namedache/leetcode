package DiGui;

/**
 * @Classname ReverseStrings
 *
 *
 *
 * @Description 一个简单的基本案例（basic case）（或一些案例） —— 能够不使用递归来产生答案的终止方案。
 *              一组规则，也称作递推关系（recurrence relation），可将所有其他情况拆分到基本案例。
 * @Date 2020-01-17 14:03
 * @Author zhoukun
 */
public class ReverseStrings {


    /**
     *
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     *
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     *
     * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
     *
     * @param s
     */
    public static  void reverseString(char[] s) {

        helper(0,s.length-1,s);
    }

    static void helper(int start,int end,char[] s){
        if (start>end) {
            return;
        }
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
        helper(start+1,end-1,s);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }



}
