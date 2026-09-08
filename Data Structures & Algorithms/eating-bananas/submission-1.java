class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int minSpeed = 1;
        int maxSpeed = 1;

        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }


        while(minSpeed <= maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            int sum = 0;
            for(int pile : piles){
                sum += (int) Math.ceil((double) pile / mid) ;
            }
            if(sum <= h){
                maxSpeed = mid - 1;
            }else{
                minSpeed = mid + 1;
            }  
        }
        return minSpeed;
        }
    }

