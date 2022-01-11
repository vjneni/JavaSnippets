package com.vijay.lc.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // One-pass Hash Table
    // Time complexity: O(n)O(n). We traverse the list containing nn elements
    // only once. Each lookup in the table costs only O(1)O(1) time.

    //  Space complexity: O(n)O(n). The extra space required depends on
    //  the number of items stored in the hash table, which stores at most nn elements
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i< nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums;
        nums = new int[] {2,7,11,15};
        int[] result;
        int target = 9;
        TwoSum obj = new TwoSum();
        result = obj.twoSum(nums, target);
        System.out.println(Math.abs(10));
        System.out.println(Arrays.toString(result));
    }
}
