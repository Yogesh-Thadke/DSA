class Solution:
    def minMoves(self, nums: List[int]) -> int:
        high = max(nums)
        return sum(abs(high-x) for x in nums)