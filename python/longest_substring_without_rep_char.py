__author__ = 'kaijiezhou'

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s)==0:
            return 0
        dup_map=dict()
        start = 0
        l = 1
        for i in xrange(0,len(s)):
            c = s[i]
            if dup_map.has_key(c):
                if start <= dup_map[c]:
                    l = max(l, i-start)
                    start = dup_map[c]+1
                    print "find dup {0} now start at {1}, lenth {2}".format(c, start, l)
            dup_map[c]=i
        return max(l, len(s)-start)

if __name__ == '__main__':
    print Solution().lengthOfLongestSubstring("cddc")