package longestCommonPrefix;

import java.util.Arrays;

/**
 * @Classname longestCommonPrefix
 * @Description 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * @Date 2019-07-26 10:33
 * @Author zhoukun
 */
public class longestCommonPrefix {



    public String longestCommonPrefixs(String[] strs) {
        if(strs.length<1) {
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String end=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==end.charAt(i)){
                result.append(first.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

}
