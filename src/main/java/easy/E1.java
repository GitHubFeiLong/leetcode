package easy;

import java.util.Arrays;

/**
 * 1两数之和
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 14:08
 */
public class E1 {
    public static void main(String[] args) {
        int[] ints = new E1().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
