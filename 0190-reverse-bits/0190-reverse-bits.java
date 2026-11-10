class Solution {
    public int reverseBits(int n) {
        String act="";
        for(int i=0 ; i<32 ; i++){
            act+=n%2;
            n/=2;
        }
        int ans=0;
        for(int i=0 ; i<act.length() ; i++){
            ans=ans*2+(act.charAt(i)-'0');
        }
        return ans;
    }
}