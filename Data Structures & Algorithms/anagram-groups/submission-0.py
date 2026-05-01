class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        # res = {}
        for s in strs:
            # key = tuple(sorted(s))
            chars = [0] * 26
            for ch in s:
                chars[ord(ch) - ord("a")] += 1
            res[tuple(chars)].append(s)
            
            # if key not in res:
            #     res[key] = []
            # res[key].append(s)
            # res[key].append(s)
        
        # return [val for val in res.values()]
        return list(res.values())


        

        