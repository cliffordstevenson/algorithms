// Best Time to Buy and Sell Stock - Sliding Window

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

Solution 1

We will use Two Pointers

L = Buy
R = Sell

only writing one for loop, so time complexity = 0(N) linear
not using any extra space, so space complexity = 0(1) constant

var maxProfit = function(prices) {
    let minBuyPrice= prices[0];
    let max=0;
    for(let i = 0; prices.length; i++){
        const sellPrice=prices[i]
        const profit=sellPrice-minBuyPrice
        max=Math.max(max, profit)
        // When would be the best time to buy?
        // given that we are to sell on dat 1
        minBuyPrice
    }
    return max;
};

// Solution 2

// var maxProfit = function(prices) {
//     // Set Left Pointer, Min buy price to Infinity, because we
//     // want to set a number so high that wheneve we get to the first
//     // actual price, it's definitely lower than that (Infinity)
//     let minBuyPrice = Infinity;
//     // Right Pointer
//     let maxProfit = 0;
//     // For Loop
//     for (let price of prices) {
//     // price will symbolize whichever stock were on
//     // now we'll check is the price of whatever stock were on lower
//     // than our minimum buy price, well yes 7 is lower than infinity
//         if(price < minBuyPrice) {
//             minBuyPrice = price;
//         } else if(price - minBuyPrice > maxProfit) {
//             maxProfit = price - minBuyPrice;
//         } 
//     }
//     return maxProfit;
// }


