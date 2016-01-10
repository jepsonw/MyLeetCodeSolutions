__author__ = 'kaijiezhou'


class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        k%=len(nums)
        self.revert_arr(nums,0, len(nums)-1)
        self.revert_arr(nums, 0, k-1)
        self.revert_arr(nums, k, len(nums)-1)

    def revert_arr(self, nums, start, end):
        while start < end:
            tmp = nums[start]
            nums[start] = nums[end]
            nums[end] = tmp
            start += 1
            end -= 1
