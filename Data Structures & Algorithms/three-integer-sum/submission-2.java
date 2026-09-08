class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
            Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int j=0; j<=nums.length -2 ; j++){
            int target = 0-nums[j];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=j+1; i<=nums.length-1; i++){
                int complement = target - nums[i];

                if(map.containsKey(complement)){
                        res.add(Arrays.asList(nums[j] , nums[map.get(complement)] , nums[i]));
                }
               map.put(nums[i],i);
        }       


        }

 return new ArrayList<>(res);

            }
}
