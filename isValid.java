/**
 * @Classname isValid
 * @Description TODO
 * @Date 2019-01-02 10:14
 * @Author zhoukun
 */
public class isValid {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (0 == len || null == nums) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (val != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;


    }

    public static void main(String[] args) {

        int[] s = {1, 2, 3, 2, 2};
        isValid isValid = new isValid();
        int j = isValid.removeElement(s, 2);
        System.out.println(j);
    }


}
