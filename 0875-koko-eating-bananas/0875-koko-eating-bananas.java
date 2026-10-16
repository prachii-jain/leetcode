class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1;
       int hi=0;
       int ans=hi;
       for(int i=0;i<piles.length;i++){
        hi=Math.max(hi,piles[i]);
       }
       while(l<=hi){
        int m=l+(hi-l)/2;
        long th=0;
        for(int i=0;i<piles.length;i++){
            th=th+(piles[i]+m-1)/m;
        }
        if(th<=h){
            ans=m;
            hi=m-1;
        }
        else{
            l=m+1;
        }
       }
       return ans;
    }
}