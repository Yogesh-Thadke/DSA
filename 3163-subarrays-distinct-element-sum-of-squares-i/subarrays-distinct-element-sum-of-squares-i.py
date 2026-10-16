class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        ans = 0
        for i in range(len(nums)):
            new_set = set()
            for j in range(i, len(nums)):
                new_set.add(nums[j])
                ans+= len(new_set)*len(new_set)

        return ans