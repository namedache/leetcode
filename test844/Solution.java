package test844;

/**
 * @program: leetcode
 * @description: 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * @author: zhoukun
 * @create: 2020-10-20 15:28
 **/
public class Solution {

    public static boolean backspaceCompare(String S, String T) {
        char[] chars = S.toCharArray();
        char[] chart = T.toCharArray();
        return  build(chars).toString().equals( build(chart).toString());
    }

    private static StringBuffer build (char[] chars){
        StringBuffer stringBuffers = new StringBuffer();
        for (char i: chars) {
            if (i == '#') {
                if (stringBuffers.length()!=0){
                    stringBuffers.deleteCharAt(stringBuffers.length()-1);
                }
            } else {
                stringBuffers.append(i);
            }
        }
        return stringBuffers;
    }

    public static void main(String[] args) {
        String S = "a#c";
        String T = "a";
        System.out.println(backspaceCompare(S,T));

    }


}
