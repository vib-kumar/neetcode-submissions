class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ch_array = [0] * 26
        for ch in s:
            ch_array[ord(ch)-ord('a')] += 1
        for ch in t:
            ch_array[ord(ch)-ord('a')] -= 1
        
        return not any(ch != 0 for ch in ch_array)


        

        