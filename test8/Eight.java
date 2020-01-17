package test8;

/**
 * @Classname Eight
 * @Description 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * @Date 2019-09-10 13:12
 * @Author zhoukun
 */
public class Eight {


    static final int MIN = -2147483648;


    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));


    }



    public static int myAtoi(String str){
        int result = 0;
        boolean flag = false;
        if (str.length()<=0||str==null){
            return 0;
        }
        int length = str.length();
        char first = str.charAt(0);
        if (!Character.isDigit(first)&&first!='-'&&first!=' '){
            return 0;
        }
        int i=0;
        int j=0;
        int[] integer = new int[length];
        while (i<length){
            char temp = str.charAt(i);
            if(temp==' '){
                i++;
            } else if (temp=='-'){
                flag = true;
                i++;
            } else if (Character.isDigit(temp)){
                integer[i] = Integer.parseInt(String.valueOf(temp));
                j++;
                i++;
            } else if (!Character.isDigit(temp)){
                break;
            }

        }
        while (j>0){
            for (int m=0;m<integer.length;m++){
                if (integer[m]!=0){
                    result += Math.pow(10,j-1)*integer[m];
                    j--;
                }

            }

        }
        if (flag){
            result = result * (-1);
        }
        if (result>=Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if (result<=Integer.MIN_VALUE||(result+1)==Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }
        return result;
    }



}
