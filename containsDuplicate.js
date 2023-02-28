// 217. Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
nums = [1,2,3,1]
/**
 * @param {number[]} nums
 * @return {boolean}
 */
function containsDuplicate(nums) {
    //create a memory - constant time
    //Go through array and see if what I see now, is something I've seen before
        //if my item is never seen before, put it in memory
        //if the number does exist in memory, return true
        // Input: nums = [1,2,3,1]
        

    let memory = {};
    for(let i = 0; i < nums.length; i ++) {
        if(memory[nums[i]] === undefined) {
            memory[nums[i]] = "haha";
        }else{
            return true;
        }
    }
    return false;
};


containsDuplicate(nums);

// Time Complexity = O(N)
// Space Complexity = 0(N)