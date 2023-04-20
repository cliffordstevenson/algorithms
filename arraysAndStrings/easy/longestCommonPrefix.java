// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.
 

// Example 1:

// Input: n = 3
// Output: ["1","2","Fizz"]
// Example 2:

// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Example 3:

// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

// Constraints:

// 1 <= n <= 104

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList();
        for (int i = 1, fizz = 0, buzz = 0; i <=n ; i++ ) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                result.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz = 0;
                result.add("Fizz");
            } else if (buzz == 5) {
                buzz = 0;
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
    }
}

// The == operator is used in this algorithm to compare the values of the fizz and buzz variables to the constant values of 3 and 5, respectively.

// In particular, the if and else if statements in the code contain conditions using the == operator to check whether the values of fizz and buzz are equal to 3 and 5, respectively. If these conditions are met, certain actions are taken (i.e. adding "FizzBuzz", "Fizz", or "Buzz" to the result list, or resetting the fizz and buzz counters to 0).

// In general, the == operator is used in Java (and many other programming languages) to check whether two values are equal. It returns true if the values are equal, and false otherwise.