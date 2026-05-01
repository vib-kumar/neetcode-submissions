class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return any(val > 1 for val in Counter(nums).values())

         