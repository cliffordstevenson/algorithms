// Compress
// Write a function, compress, that takes in a string as an argument. The function should return a compressed version of the string where consecutive occurrences of the same characters are compressed into the number of occurrences followed by the character. Single character occurrences should not be changed.

// 'aaa' compresses to '3a'
// 'cc' compresses to '2c'
// 't' should remain as 't'
// You can assume that the input only contains alphabetic characters.

// test_00:
// compress('ccaaatsss'); // -> '2c3at3s'
// test_01:
// compress('ssssbbz'); // -> '4s2bz'
// test_02:
// compress('ppoppppp'); // -> '2po5p'
// test_03:
// compress('nnneeeeeeeeeeeezz'); // -> '3n12e2z'
// test_04:
// compress('yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy'); 
// // -> '127y'

// Solution

// Two Pointers
// i and j
// i represents start, j is the end

// const compress = (s) => {
//     let result = '';
//     let i = 0;
//     let j = 0;
//     while( j< s.length) {
//         if(s[i] === s[j]) {
//             j+=1;
//         } else {
//             num = j-i
//             if (num ===1) {
//                 result += s[i];
//             } else {
//                 result += num + s[i]
//             }
//             i = j
//         }
//     }
//     return result;
// };

// console.log(compress('ccaaatsss'));

// This solution above is N(N) time complexity because
// lines result += s[i] are concat javascript functions
// with a linear runtime themselves
// below is the solution 

const compress = (s) => {
    let result = [];
    let i = 0;
    let j = 0;
    while( j< s.length) {
        if(s[i] === s[j]) {
            j+=1;
        } else {
            num = j-i
            if (num ===1) {
                result.push(s[i])
            } else {
                result.push(num, s[i])
            }
            i = j
        }
    }
    return result.join('');
};

console.log(compress('ccaaatsss'));

// the push function adds them in order, even with the commas
// this has a linear solution
