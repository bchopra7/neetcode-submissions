class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>, List<String>> map = new HashMap<>();

        for(String s : strs){
            HashMap<Character,Integer> fMap = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);
                fMap.put(c, fMap.getOrDefault(c,0) + 1);                
                }
            map.computeIfAbsent(fMap, k -> new ArrayList<>()).add(s); 
        }
        

        List<List<String>> res = new ArrayList<>();
        for(List<String> str : map.values()){
            res.add(str);
        }
        return res;
    }
}
