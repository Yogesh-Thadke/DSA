class Solution:
    def minOperations(self, s: str) -> int:
        n = len(s)
        
        if all( a<=b for a, b in zip(s,s[1:])):
            return 0

        if n == 2:
            return -1

        mx, mn = max(s), min(s)

        if mn == s[0] or mx == s[-1]:
            return 1

        for i in range(1, n-1):
            if mn == s[i] or mx == s[i]:
                return 2
        
        return 3