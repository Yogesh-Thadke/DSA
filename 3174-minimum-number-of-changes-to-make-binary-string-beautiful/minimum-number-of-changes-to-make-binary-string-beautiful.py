class Solution:
    def minChanges(self, s: str) -> int:
        ans = 0
        l = 0
        r = 1

        while l < len(s):
            if s[l] != s[r]:
                ans+=1
            l = r+1
            r = l+1

        return ans