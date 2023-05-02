const rangeCompact = nums => {
    let result = '';
    let start = nums[0];
    let end = start;
    
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] === end + 1) {
            end = nums[i];
    } else {
        if (end === start) {
            result += start + ',';
        } else if (end === start + 1) {
            result += start + ',' + end + ',';
        } else {
            result += start + '-' + end + ',';
        }
        start = nums[i];
        end = start;
        }
    }
    return result;
}

console.log(rangeCompact([1, 2, 3, 5, 7, 8, 10, 11, 12]))