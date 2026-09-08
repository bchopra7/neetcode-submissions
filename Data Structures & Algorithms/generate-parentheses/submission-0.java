class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();

        backTrack(arr,"",0,0,n);
        return arr;
    }

    public void backTrack(List<String> arr, String curr, int open, int close, int max){
        if(curr.length()==2*max){
            arr.add(curr);
            return;
        }

        if(open<max)
            backTrack(arr, curr+"(",open+1,close,max);
        if(close<open)
            backTrack(arr, curr+")",open,close+1,max);

    }
}
