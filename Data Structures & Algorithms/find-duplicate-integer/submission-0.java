class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int num=0;
        for(int n:nums){
            if(set.contains(n)){
                num= n;
            }
            set.add(n);
        }
        return num;
    }
}
