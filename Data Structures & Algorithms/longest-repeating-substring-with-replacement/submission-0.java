class Solution {
    public int characterReplacement(String s, int k) {
        
        //https://www.youtube.com/watch?v=ExY8svHF_Eo

        int freq[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right <s.length();right++){
            freq[s.charAt(right)-'A']++;

            int windowLength  = right - left + 1;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);
            if(windowLength - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength  = right - left + 1;
            maxLength = Math.max(maxLength,windowLength);
        }

        return maxLength;
    }
}
