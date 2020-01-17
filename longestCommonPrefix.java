/**
 * @Classname longestCommonPrefix
 * @Description TODO
 * @Date 2018-12-29 10:56
 * @Author zhoukun
 */
public class longestCommonPrefix {

    public static String prefix(String[] strs) {

        if (strs.length == 0) {
            return strs[0];
        }
        StringBuffer stringBuffer = new StringBuffer();
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return stringBuffer.toString();
                }
                if (strs[j] == null) {

                }
            }
        }


        return null;
    }


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};


    }
}
