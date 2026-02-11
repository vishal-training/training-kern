
class Solution:
    def findDuplicates(self, nums):
        d=[]
        new=set{}
        for i in nums:
            if i in new:
                



s=Solution()
print(s.findDuplicates([1,2,3,2,4,1,5]))
