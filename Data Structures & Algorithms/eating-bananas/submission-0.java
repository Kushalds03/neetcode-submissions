class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=high;
        while(low<=high){
            long count=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
                int rem=(piles[i]+mid-1)/mid;
                count=count+rem;
            }
            if(count<=h){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}

