class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)
        
        arr = []
        for num, freq in count.items():
            arr.append([freq, num])
        arr.sort()
        
        res = []
        while len(res) < k:
            res.append(arr.pop()[1])
        
        return res
