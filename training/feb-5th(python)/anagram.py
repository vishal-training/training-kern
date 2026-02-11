class Solution:
    def isAnagram(self, s, t):
        return sorted(s)==sorted(t)

x=Solution()
print(x.isAnagram("listen","silent"))
