class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int currMax = 1;
            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr++;
                    currMax++;
                }
            }
            max =  Math.max(max, currMax);
        }
        return max;
    }
}
