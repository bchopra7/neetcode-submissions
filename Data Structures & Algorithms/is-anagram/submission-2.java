class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hMap = new HashMap<>();

        if(s.length() !=  t.length()) return false;

        for(Character c : s.toCharArray()){
                hMap.put(c, hMap.getOrDefault(c,0)+1);  
        }

        for(Character c : t.toCharArray()){
            if(!hMap.containsKey(c)) return false;

            hMap.put(c,hMap.get(c)-1);

            if(hMap.get(c) == 0){
                hMap.remove(c);
            }
        }

        if(hMap.isEmpty()) return true;

        return false;

    }
}
