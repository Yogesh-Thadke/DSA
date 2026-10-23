class Solution:
    def sortPermutation(self, nums: List[int]) -> int:
        
        ans = -1
        for i in range(0,len(nums)):
            if nums[i] != i:
                ans &= nums[i]

        return max(ans,0)