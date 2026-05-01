class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_diff = float('-inf')
        for i in range(len(prices)-1):
            for j in range(i+1, len(prices)):
                max_diff = max(max_diff, prices[j]-prices[i])
        
        return max(0, max_diff)
        