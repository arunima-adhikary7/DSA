class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:

       
        # for i in range(0,k):
        #     sum+=nums[i]

        
        
        windowsum=sum(nums[:k])
        maxsum=windowsum
        
        for j in range(k,len(nums)):
            windowsum+=nums[j]   #j=5
            windowsum-=nums[j-k]   #j-k=5-4=1

            maxsum=max(maxsum,windowsum)
    
        return maxsum/k

        