package test17;

import java.util.List;

/**
 * @Classname letterCombination
 * @Description 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @Date 2019-12-13 10:04
 * @Author zhoukun
 */
public class letterCombination {

    String[] word = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits==null||digits.length()<0){
            return  null;
        }
        for (int i = 0; i < digits.length(); i++) {
            int integer = Integer.valueOf(digits.charAt(i));
            String first = word[integer-2];
        }



        return null;

    }




}
