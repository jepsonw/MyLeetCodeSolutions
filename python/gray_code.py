__author__ = 'kaijiezhou'

class Solution:
    def grayCode(self, n):
            """
            :type n: int
            :rtype: List[int]
            """
            if n<1:
                return [0]
            if n==1:
                return [0,1]
            last_code=self.grayCode(n-1)
            first_bit=1<<(n-1)
            i=len(last_code)-1
            while i>=0:
                last_code+=[first_bit+last_code[i]]
                i-=1

            return last_code
