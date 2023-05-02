import java.util.HashSet;

class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    // Time= O(n), Space = O(n)
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();

        for ( int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}


// Sort 0(n log n), 0(1);
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sort the array in ascending order
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // if adjacent elements are equal, there is a duplicate
            }
        }
        return false; // no duplicates found
    }
}

// Brute Force - O(n^2) worst case, 0(1);
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // if two elements are equal, there is a duplicate
                }
            }
        }
        return false; // no duplicates found
    }
}

