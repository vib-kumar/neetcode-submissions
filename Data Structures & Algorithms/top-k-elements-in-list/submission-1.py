class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)
        cutoff = sorted([val for val in count.values()], reverse=True)[k-1]
        
        res = []
        for k,v in count.items():
            if v >= cutoff:
                res.append(k)
        return res
