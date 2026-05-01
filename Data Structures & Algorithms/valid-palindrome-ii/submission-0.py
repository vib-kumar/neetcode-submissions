class Solution:
    def validPalindrome(self, s: str) -> bool:
        if s == s[::-1]:
            return True
        l = 0
        r = len(s)-1
        while l < r:
            if s[l] == s[r]:
                l+=1
                r-=1
            else:
                str1 = s[l:r]
                str2 = s[l+1:r+1]
                return str1 == str1[::-1] or str2 == str2[::-1]
        