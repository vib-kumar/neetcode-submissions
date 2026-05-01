class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> exists = new HashMap<Integer, Integer>();
        for(int i =0  ; i < nums.length ; i++){
            int diff = target - nums[i]; 
            if(exists.containsKey(diff)){
                return new int[]{exists.get(diff),i};
            }
            else{
                exists.put(nums[i],i);
            }

        }
        return new int[]{};

    }   

}
