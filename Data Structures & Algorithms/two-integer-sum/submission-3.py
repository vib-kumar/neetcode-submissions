class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        maps = {}

        for i, num in enumerate(nums):
            maps[num] = i

        for i, num in enumerate(nums):
            comp = target - num
            if comp in maps and maps[comp] != i:
                return [i, maps[comp]]
        return []




        