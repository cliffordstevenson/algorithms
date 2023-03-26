import java.util.HashSet;

class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    // Time= O(n), Space = O(n)
    public static boolean containsDuplicate(int[] nums) {
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

    // Time= (n log n) quasilinear time complexity, Space= 0(1);
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}

