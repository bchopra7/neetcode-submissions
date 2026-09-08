class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> b[] = new List[nums.length + 1];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


        for(Integer key : map.keySet()){
            int freq = map.get(key);
            if(b[freq]== null){
                b[freq] = new ArrayList<>();
            }
            b[freq].add(key);
        }

        int res[] = new int[k];
        int c=0;
        for(int p=b.length-1;p>=0 && c<k; p--){
            if(b[p]!=null){
                for(Integer integr: b[p]){
                    res[c++] = integr;
                }
            }
        }
        return res;
    }
    
}
