class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        ans = []
        nums.sort()
        l = 0
        start = end = -1
        r=len(nums)-1

        while l<=r:
            mid = l+(r-l)//2
            
            if nums[mid] == target:
                start = mid
                r = mid-1
            elif target < nums[mid]:
                r = mid-1
            else:
                l = mid+1

        l, r = 0, len(nums) - 1

        while l<=r:
            mid = l+(r-l)//2
            
            if nums[mid] == target:
                end = mid
                l = mid + 1
            elif target < nums[mid]:
                r = mid-1
            else:
                l = mid+1

        for i in range(start,end+1):
            ans.append(i)
        if start == -1:
            return []
            
        return ans
