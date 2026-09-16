class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> present = new HashSet<>();
       for(int i:nums){
        if(present.contains(i)){
            return true;
        }
        else{
            present.add(i);
        }
       }
       return false;
    }
}