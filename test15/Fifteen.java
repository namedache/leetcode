package test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Fifteen
 * @Description TODO
 * @Date 2019-09-11 09:54
 * @Author zhoukun
 */
public class Fifteen {


    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length<3||nums==null){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i <length ; i++) {
            if (nums[i]>0) {break;}

        }



        return result;
    }


}
