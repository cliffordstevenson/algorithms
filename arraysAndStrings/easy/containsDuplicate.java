import java.util.HashSet;

class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }


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
}

