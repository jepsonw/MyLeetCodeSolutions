__author__ = 'kaijiezhou'

class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        results=[]
        results.append([])
        for i in xrange(0, len(nums)):
            snapshot=list(results)
            for result in snapshot:
                elem=list(result)
                if len(elem)==0 or elem[len(elem)-1]< nums[i]:
                    elem.append(nums[i])
                    results.append(elem)
        return results
