class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums) {
            if(set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}

class printFunction { 
    public static void main(String[] args) { 
        System.out.println(containsDuplicate([1,2,3,4])); 
    }
}