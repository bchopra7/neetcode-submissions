class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length - 2; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    res.add(Arrays.asList(nums[left] , nums[right] , nums[i]));
                    left++;
                    right--;
                }
                else if(sum > 0){
                    right--;
                }
                else left ++;
            }
        }
    return new ArrayList<>(res);
    }
}
