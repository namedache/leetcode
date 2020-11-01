package test1710;

import java.util.HashMap;

/**
 * @author zhoukun
 */
public class Test {

    public static int majorityElement(int[] nums) {
        int side = nums.length/2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                int count = hashMap.get(nums[i]);
                hashMap.put(nums[i],++count);
                if (count>side){
                    return nums[i];
                }
            } else {
                hashMap.put(nums[i],1);
                if (1>side){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(majorityElement(nums));
    }



}
