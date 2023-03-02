// Five sort

// Write a function, fiveSort, that takes in an array of numbers as an argument. The function should rearrange elements of the array such that all 5s appear at the end. Your function should perform this operation in-place by mutating the original array. The function should return the array.

// Elements that are not 5 can appear in any order in the output, as long as all 5s are at the end of the array.

// test_00
// fiveSort([12, 5, 1, 5, 12, 7]);
// // -> [12, 7, 1, 12, 5, 5] 
// test_01
// fiveSort([5, 2, 5, 6, 5, 1, 10, 2, 5, 5]);
// // -> [2, 2, 10, 6, 1, 5, 5, 5, 5, 5] 
// test_02
// fiveSort([5, 5, 5, 1, 1, 1, 4]);
// // -> [4, 1, 1, 1, 5, 5, 5] 
// test_03
// fiveSort([5, 5, 6, 5, 5, 5, 5]);
// // -> [6, 5, 5, 5, 5, 5, 5] 
// test_04
// fiveSort([5, 1, 2, 5, 5, 3, 2, 5, 1, 5, 5, 5, 4, 5]);
// // -> [4, 1, 2, 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5] 
// test_05
// const fives = new Array(20000).fill(5);
// const fours = new Array(20000).fill(4);
// const nums = [...fives, ...fours];
// fiveSort(nums);
// // twenty-thousand 4s followed by twenty-thousand 5s
// // -> [4, 4, 4, 4, ..., 5, 5, 5, 5]

// Solution
// Two Pointers, one at the beginning, one at the end
// each incrementing in by one. if theres a five at i
// the LH pointer, switch it with the j at the RH side
// Time: 0(n) linear
// Space: 0(1) constant

const fiveSort = (nums) => {
    let i = 0;
    // setting 'j' to length-1 is to give it a VALID index.
    // an array with 5 items will have 0,1,2,3,4 for indeces
    let j = nums.length -1;

    // Once i crosses j, we will be finished, hence this while loop
    while (i <= j) {
        // obviously if RH side has a 5, thats bad. We want to skip it
        // because it's where it's supposed to be
        if(nums[j] === 5) {
            j -= 1;
            // here we do array destructuring in javascript to move the
            // LH '5' to the RH side
        } else if (nums[i] === 5) {
            [ nums[i], nums[j]] = [nums[j], nums[i]]
            // then increment our 'i'
            i += 1;
        } else {
            i += 1;
        }
    }
    return nums;
}

console.log(fiveSort([12, 5, 1, 5, 12, 7]))



