class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        
        for i in range(len(nums)):
            nums[i] = nums[i]*nums[i]

        nums.sort()

        l=0
        r=(len(nums)-1)
        ans = 0

        while l<=r:
            if l==r:
                ans+=nums[l]
                break
            ans+=nums[r]
            ans-=nums[l]
            l+=1
            r-=1

        return ans