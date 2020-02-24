package DiGui;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname generate
 * @Description 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @Date 2020-01-19 14:43
 * @Author zhoukun
 */
public class Generates{



    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows==0){
            return triangle;
        }
        for (int i=1;i<=numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 1; j <=i; j++) {
                list.add(num(i,j));
            }
            triangle.add(list);
        }
        return triangle;

    }

    public static int num(int i,int j){
        if (j==1||j==i){
            return 1;
        }
        return num(i-1,j-1)+num(i-1,j);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(generate(30));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
