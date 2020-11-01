package test925;

/**
 * @program: leetcode
 * @description: 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。  你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/long-pressed-name 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: zhoukun
 * @create: 2020-10-22 14:44
 **/
public class Solution {

    public static boolean isLongPressedName(String name, String typed) {
        
        if (name.equals(typed)){
            return Boolean.TRUE;
        } else {
            char[] names = name.toCharArray();
            char[] typeds = typed.toCharArray();
            int i = 0,j=0;
            boolean flag = true;
            while (j< typeds.length&&i< names.length){
                char a = names[i];
                char b = typeds[j];
                if ( names[i] == typeds[j] ){
                    i++;
                    j++;
                } else {
                    if (typeds[j-1]==typeds[j]){
                        j++;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
            
        }
    }


    public static void main(String[] args) {
        System.out.println(isLongPressedName("pyplrz","ppyypllr"));
    }


}
