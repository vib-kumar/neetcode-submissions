class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        length = max(len(nums), max(nums))

        for i in range(length+1):
            if i not in nums:
                return i
        return 0

        