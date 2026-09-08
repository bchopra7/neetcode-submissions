class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> bucket[] = new List[nums.length + 1];
        int res[] = new int[k];

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            int freq = val.getValue();
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(val.getKey());
        }

        int count = 0;
        for(int i = nums.length; i >= 0 && count < k; i--){
            if(bucket[i] != null){
                for(Integer val : bucket[i]){
                    res[count++] = val;
                    if(count >= k){
                        break;
                    }
                }
            }

        }

        return res;


    }
}
