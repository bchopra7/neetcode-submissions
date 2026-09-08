class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l<r){
            int lHeight = heights[l];
            int rHeight = heights[r];

            int area = Math.min(heights[l],heights[r]) * (r-l);
            res = Math.max(res,area);

            if(lHeight < rHeight){
                l++;
            } 
            else r--;
        }
        return res;
    }
}
