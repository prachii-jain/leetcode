class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> s= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int ind= Math.abs(nums[i]) - 1;
            if (nums[ind] < 0) {
                continue;
            }
            else{
                nums[ind]*=-1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                s.add(i + 1);
            }
        }
        return s;
    }
}