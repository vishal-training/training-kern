class Solution:
    def arraySum(self, nums):
        s=0
        for i in nums:
            s+=i
        return s
s=Solution()
print(s.arraySum([1,2,3,4]))