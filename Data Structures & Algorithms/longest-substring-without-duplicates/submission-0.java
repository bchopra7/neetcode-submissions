class Solution {
    public int lengthOfLongestSubstring(String s) {
        //https://www.youtube.com/watch?v=3IETreEybaA
        int l=0;
        int r=0;
        int max=0;
        HashSet<Character> hset = new HashSet<>();

        while(r<s.length()){
            if(!hset.contains(s.charAt(r))){
                hset.add(s.charAt(r));
                max= Math.max(max,hset.size());
                r++;
            }
            else{
                hset.remove(s.charAt(l));
                l++;
            }
        }
        return max;

    }
}
