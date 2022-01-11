package com.vijay.lc.array;
    public class RemoveDuplicates {
        // Two Pointer Approach - Optimal O(n)
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{ 1,1,3,3,5,5,7,9,9,10 };
            int[] expectedNums = new int[]{};
            int k = removeDuplicates(nums);
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i]+" ");
            }
        }
    }


