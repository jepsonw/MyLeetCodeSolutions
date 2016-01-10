__author__ = 'kaijiezhou'
class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        candidates.sort()
        result=[]
        results=[]
        self.helper(results, result, candidates, target, 0)
        return results

    def helper(self, results, result, candidates, target, pos):
        if target==0:
            results.append(list(result))
        elif target>0:
            for i in xrange(pos, len(candidates)):
                result.append(candidates[i])
                self.helper(results, result, candidates, target-candidates[i], i)
                #remove from list by index
                result.pop(len(result)-1)


