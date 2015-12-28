class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        tar_map=dict()
        for i in xrange(0, len(nums)):
            tar_map[target-nums[i]] = i
        for i in xrange(0, len(nums)):
            if tar_map.has_key(nums[i]) and tar_map[nums[i]] != i:
                return i+1, tar_map[nums[i]]+1
        return None