// Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

// Hash Map Ti= O(n), Sp= O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i<nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } 
            map.put(nums[i], i);
        }
        return null;
    }
}

// Brute force 0(n^2), 0(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}

// Sorting Solution 0(n log n), 0(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                int i = findIndex(nums, sortedNums[left]);
                int j = findIndex(nums, sortedNums[right]);
                return new int[] { i, j };
            }
        }
        return null;
    }
    
    private int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

}


