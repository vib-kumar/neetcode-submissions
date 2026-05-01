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
                    top_ele = stack[-1]
                else:
                    top_ele = '@'
                
                if top_ele == brackets[ch]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(ch)
        return False if stack else True
        