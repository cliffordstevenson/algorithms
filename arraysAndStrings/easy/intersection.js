// intersection

// Write a function, intersection, that takes in two arrays, a,b, as arguments. The function should return a new array containing elements that are in both of the two arrays.

// You may assume that each input array does not contain duplicate elements.

// test_00:
// intersection([4,2,1,6], [3,6,9,2,10]) // -> [2,6]
// test_01:
// intersection([2,4,6], [4,2]) // -> [2,4]
// test_02:
// intersection([4,2,1], [1,2,4,6]) // -> [1,2,4]
// test_03:
// intersection([0,1,2], [10,11]) // -> []
// test_04:
// const a = [];
// const b = [];
// for (let i = 0; i < 50000; i += 1) {
//   a.push(i);
//   b.push(i);
// }
// intersection(a, b) // -> [0,1,2,3,..., 49999]

// // Brute Force Solution
// const intersection = (a, b) => {
//     // initialize result array
//     const result = [];
//     // for "of" loop iterates through every item of array in order
//     for (let item of a) {
//         // using a 'builtin' function which under the hood is a forloop
//         if (b.includes(item)) {
//             result.push(item);
//         }
//     }
//     return result;
// }

// JavaScript Set Solution
// Because the for loops are not nested, run time is faster
const intersection = (a, b) => {
    const result = [];
    const items = new Set();
    for (let item of a) {
        items.add(item)
    }
    for (let ele of b) {
        if(items.has(ele)) {
            result.push(ele);
        }
    }
    return result;
}



