class Solution:
    def isValid(self, s: str) -> bool:
        brackets = {}
        brackets[')'] = '('
        brackets['}'] = '{'
        brackets[']'] = '['

        stack = []
    
        for ch in s:
            if ch in brackets:
                if stack:
                    ele = stack[-1]
                else:
                    ele = "#"
                
                if brackets[ch] == ele:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(ch)
        if stack:
            return False
        else:
            return True




        