class Solution {
    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }

        System.out.println("false");
        return false;
    }
}