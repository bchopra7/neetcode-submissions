class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int min = 1;
        int max = 0;
        for(int pile: piles){
            max =  Math.max(pile,max);
        }


        while(min<max){
            int mid = min +(max-min)/2;

            if(kokoCanEat(piles,h,mid)){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        return min;

    }

    public Boolean kokoCanEat(int[] piles, int h, int mid){

        int sum = 0;
        for(int pile : piles){
            sum += (int) Math.ceil((double) pile / mid);
        }
        return sum<=h;

    }
}
