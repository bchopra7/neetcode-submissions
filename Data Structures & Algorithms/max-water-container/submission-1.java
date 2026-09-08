class Solution {
    public int maxArea(int[] heights) {
        int res = 0;

        int lp = 0;
        int rp = heights.length - 1;

        while(lp < rp){
            int lHeight = heights[lp];
            int rHeight = heights[rp];

            int area = Math.min(lHeight,rHeight) * (rp - lp);
            res = Math.max(res, area);
            if(lHeight < rHeight){
                lp++;
            }
            else{
                rp--;
            }
        }
        return res;
    }
}
