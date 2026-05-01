class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_map = [0] * 26
        for ch in s:
            char_map[ord(ch) - ord('a')] += 1
        for ch in t:
            char_map[ord(ch) - ord('a')] -= 1
        return all(freq == 0 for freq in char_map)
        

        