class Solution:
    def int_bin(self, n: int) -> str:
        binary = []
        if n == 0:
            return "0"
            
        while n:
            rem = n%2
            n = n//2

            binary.append(rem)
            binary = binary[::-1]
        return "".join([str(x) for x in binary])

    def num_ones(self, s:str) -> int:
        res = 0
        for ch in s:
            if ch == "1":
                res += 1
        return res

    def countBits(self, n: int) -> List[int]:
        final = []
        for i in range(n+1):
            bin_str = self.int_bin(i)
            num = self.num_ones(bin_str)

            final.append(num)
        return final
    
        