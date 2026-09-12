class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ans=[]
        currsum=0
        i=0
        for i in nums:
            currsum+=i
            ans.append(currsum)
        return ans
            
        