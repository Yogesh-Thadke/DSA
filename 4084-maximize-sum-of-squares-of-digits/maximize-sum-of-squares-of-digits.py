class Solution:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
        if sum > num*9:
            return ""
        ans = ""
        r = sum%9
        nines = sum//9

        for i in range(nines):
            ans+='9'

        if r>0:
            ans+= str(r)

        zero_count = num-len(ans)

        for i in range(zero_count):
            ans+= '0'

        return ans


    
        