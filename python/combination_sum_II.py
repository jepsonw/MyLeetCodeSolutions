__author__ = 'kaijiezhou'


class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        result=[]
        results=[]
        candidates.sort()
        self.helper(results, result, candidates, target, 0)
        return results

    def helper(self, results, result, candidates, target, pos):
        if target==0:
            if result not in results:
                results.append(list(result))
        elif pos<len(candidates) and target>=candidates[pos]:
            for i in xrange(pos, len(candidates)):
                result.append(candidates[i])
                self.helper(results, result, candidates, target-candidates[i], i+1)
                result.pop(len(result)-1)