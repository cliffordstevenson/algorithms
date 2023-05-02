// Task
// In this challenge, you will write a function to divide an integer into a number of even parts, which will be returned in a result array. Summing the integers in this result array will produce the original number.

// For example, given number = 10 and parts = 2, splitInteger(10, 2) should return an array of integers with length equal to parts: [5, 5].

// Not all numbers will offer a clean division. In this case, we should split the number as closely as possible to even, with the smaller numbers in the front of the array. For example,

// splitInteger(11, 3) → [3, 4, 4]
// There is no reason to test for edge cases; the input to your function will always be valid for this challenge. Please see the below specification for the exact constraints on the input:

// splitInteger(num, parts)
// Divides an integer into an even number of parts.

// Parameters
// num: Number - The integer number that should be split into equal parts

// parts: Number - The number of parts that the integer should be split into

// Return Value
// Array<Number> - An array of part values which sum to num. The parts will be ordered from smallest to largest.

// Constraints
// 0 < num ≤ 100
// 0 < parts ≤ num
// Examples
// num	parts	Return Value
// Completely even parts	10	5	[2,2,2,2,2]
// Divided as closely as possible into even parts with the smallest parts grouped at the front of the result	

// should work on uneven tests
// expected [ 4, 4, 3, 3, 3, 3 ] to deeply equal [ 3, 3, 3, 3, 4, 4 ]

// should handle random cases
// expected [ 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 ] to deeply equal [ 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 ]

// Should work on a big test
// expected [ 109, 109, 109, 109, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108 ] to deeply equal [ 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 109, 109, 109, 109 ]

// const splitInteger = (num, parts) => {
//     const quotient = Math.floor(num/parts);
//     const remainder = num % parts;
//     const result = [];

//     for(let i = 0; i < parts; i++) {
//         const value = quotient + (i < remainder ? 1 : 0);
//         result.push(value);
//     }

//     return result;

// };

/**
 * Splits an integer into evenly-sized parts.
 *
 * @param {number} num - The number to split.
 * @param {number} parts - The number of parts to split num into.
 * @returns {number[]} The values after splitting num into parts.
*/
const splitInteger = (num, parts) => {
    const quotient = Math.floor(num / parts);
    const remainder = num % parts;
    console.log(remainder);
    const result = [];

    for (let i = 0; i < parts; i++) {
        result.push(quotient);
    }

    for (let i = 0; i < remainder; i++) {
        result[i]++;
    }

    // Sort the result array in descending order
    result.sort((a, b) => a - b);

    return result;
};

console.log(splitInteger(48, 5));
