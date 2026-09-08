class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> final_output = new ArrayList<>();

        backTrack(final_output,"",0,0,n);
        return final_output;
    }

    public void backTrack(List<String> final_output, String curr, int open, int close, int max){
        if(curr.length()==2*max){
            final_output.add(curr);
            return;
        }

        if(open<max)
            backTrack(final_output, curr+"(",open+1,close,max);
        if(close<open)
            backTrack(final_output, curr+")",open,close+1,max);

    }
}
