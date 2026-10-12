class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        sum=0
        for i in range(0,k):
            sum+=nums[i]
        
        maxsum=sum
        
        for j in range(k,len(nums)):
            sum+=nums[j]   #j=5
            sum-=nums[j-k]   #j-k=5-4=1

            maxsum=max(maxsum,sum)
    
        return maxsum/k

        