// best practice add semicolons to end of statements because javascript
// will put them in for you if you don't, but it will do it in a way that
// may not be what you want. 

var x = 21;
var girl = function() {
    console.log(x);
    var x = 20;
};
girl(); 

// var doesn't have block scope, it has function scope.
// the difference between var and let is that let has block scope.
// block scope is the scope of a block of code, which is the scope of
// a function.

