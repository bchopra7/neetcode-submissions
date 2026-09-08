class Solution {

    boolean isFreqSame(int s1[],int s2[]){
        for(int i=0; i<26; i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        int freq[]= new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        int windSize = s1.length();
        for (int j=0; j<s2.length();j++){
            int idx=j;
            int searchIdx=0;
            int searchFreq[]= new int[26];
            while(searchIdx!=windSize && idx<s2.length()){    
                searchFreq[s2.charAt(idx)-'a']++;
                idx++;
                searchIdx++;
            }

            if(isFreqSame(searchFreq,freq)){
                return true;
            }

            
        }
        return false;
    }
}
