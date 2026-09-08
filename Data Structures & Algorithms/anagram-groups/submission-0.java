class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character,Integer>,List<String>> bMap = new HashMap<>();


        for(String str : strs){
            HashMap<Character,Integer> fMap = new HashMap<>();
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                fMap.put(c,fMap.getOrDefault(c,0)+1);
            }
                if(!bMap.containsKey(fMap)){
                    List<String>arr = new ArrayList<>();
                    arr.add(str);
                    bMap.put(fMap,arr);
                }
                else{
                    List<String>arr = bMap.get(fMap);
                     arr.add(str);
            }
    }

    List<List<String>> res = new ArrayList<>();
    for(List<String>val : bMap.values()){
        res.add(val);
    }
    return res;

    }
}
