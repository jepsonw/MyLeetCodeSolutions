__author__ = 'kaijiezhou'


class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        position=self.binary_search(nums,target, 0, len(nums)-1)
        if nums[position]<target:
            return position+1
        return position

    def binary_search(self, nums, target, start, end):
        mid=(start+end)/2
        if nums[mid]==target:
            return mid
        elif end<=start:
            return start
        elif nums[mid]>target:
            return self.binary_search(nums, target, start, mid-1)
        else:
            return self.binary_search(nums, target, mid+1, end)

if __name__ == '__main__':
    print Solution().searchInsert([1,3],4)