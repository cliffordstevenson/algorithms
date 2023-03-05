// Valid Palindrome

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.



// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.


// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

var isPalindrome = function (s) {
    // using alphabet so that we know if theres a comma or space or something
    let alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    let letters = alphabet.split('')

    // edge case, making sure theres length
    if (!s.length > 1) {
        return true;
    }

    let left = 0;
    let right = s.length - 1;

    while (left < right) {
        if (!letters.includes(s[left])) {
            left++;
        } else if (!letters.includes(s[right])) {
            right--;
        } else {
            if (s[left].toLowerCase() != s[right].toLowerCase()) {
                return false
            } 
            left++
            right--
        }
    }
    return true
}

console.log(isPalindrome('s'))