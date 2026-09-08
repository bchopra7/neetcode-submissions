class Solution {
    public int longestConsecutive(int[] nums) {
        Integer max = 0;
        HashSet<Integer> hSet = new HashSet<>();

        for(int num : nums){
            hSet.add(num);
        }


        for(int i=0; i < nums.length; i++){
            Integer curr = nums[i];

            Integer curr_max = 1;
           
                while(hSet.contains(curr+1)){
                    curr++;
                    curr_max++;
                }
            
            max = Math.max(max,curr_max);
        }
        return max;
    }
}
