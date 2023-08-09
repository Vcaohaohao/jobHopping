package main.codingPractice.leetcode.sequence;

import java.util.HashMap;
import java.util.Map;

/**
 * 按照顺序第一道题
 */
public class T1 {

    public static final int[] nums = new int[]{2, 7, 11, 15};
    public static final int target = 9;

    /**
     * 使用hash表解决，降低时间复杂度
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            //如果我需要的值在里面
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{
                        hashTable.get(target - nums[i]), i
                };
            }

            hashTable.put(nums[i], i);
        }
        return new int[0];
    }

}
