class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        combination(candidates,target,li,0,ans);
        return ans;
    }
    public static void combination(int[]candidates,int amount,List<Integer>li,int idx,List<List<Integer>>ans){
        if(amount==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(amount>=candidates[i]){
                li.add(candidates[i]);
                combination(candidates,amount-candidates[i],li,i,ans);
                li.remove(li.size()-1);
            }
        }
    }
}