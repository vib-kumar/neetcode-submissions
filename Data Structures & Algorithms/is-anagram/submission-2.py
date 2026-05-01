class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ch_array = [0] * 26
        for ch in s:
            ch_array[ord(ch)-ord('a')] += 1
        for ch in t:
            ch_array[ord(ch)-ord('a')] -= 1
        return ch_array == [0] * 26

        