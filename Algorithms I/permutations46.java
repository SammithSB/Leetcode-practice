/* 
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            result.add(toList(nums));
            return;
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(i, start, nums);
                backtrack(result, nums, start + 1);
                swap(i, start, nums);
            }
        }
    }

    public List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums) {
            res.add(i);
        }
        return res;
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}