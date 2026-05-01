class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ct = Counter(nums)

        for k,v in ct.items():
            if v == 1:
                return k
        