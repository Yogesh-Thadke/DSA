class Solution:
    def minOperations(self, s: str) -> int:
        n = len(s)
        sorted = True
        for i in range(n-1):
            if s[i] > s[i+1]:
                sorted = False
                break
        
        if sorted:
            return 0

        if n == 2:
            return -1

        max, min = 'a', 'z'
        min_count = max_count = 0

        for i in range(n):
            if s[i] < min:
                min = s[i]
                min_count = 1
            elif s[i] == min:
                min_count+=1

            if s[i] > max:
                max = s[i]
                max_count = 1
            elif s[i] == max:
                max_count+=1

        if min == s[0] or max == s[n-1]:
            return 1

        if min == s[n-1] and max == s[0] and min_count == 1 and max_count == 1:
            return 3

        return 2