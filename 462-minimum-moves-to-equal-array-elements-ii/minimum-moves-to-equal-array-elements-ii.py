class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()

        mid = len(nums)//2
        ans = 0
        for i in range(len(nums)):
            ans += abs(nums[mid]-nums[i])

        return ans