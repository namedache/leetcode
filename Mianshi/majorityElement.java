package Mianshi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Classname majorityElement
 * @Description TODO
 * @Date 2019-10-16 14:31
 * @Author zhoukun
 */
public class majorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;

        for(int num : nums)   //统计每个元素出现的次数
        {
            Integer count = map.get(num);
            if(count == null){
                count =1;
            }
            else{
                count++;
            }
            map.put(num,count);
            if(map.get(num) > n/2){
                return num;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        majorityElement majorityElement = new majorityElement();
        int[] nums = new int[]{2,3,4,5,5,5,5};
        System.out.println(majorityElement.majorityElement(nums));
    }




}
