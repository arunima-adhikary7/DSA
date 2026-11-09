class Solution {
    
    //     int low=1;
    //     int high=0;
    //     for(int pile:piles)
    //     {
    //         high=Math.max(high,pile);
    //     }
    //     int ans=high;
    //     while(low<=high)
    //     {
    //         int mid=low+(high-low)/2;
    //         if(canEat(piles,mid, h))
    //         {
    //             ans=mid;
    //           high=mid-1;
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //     return ans;
        
    // }
    // private boolean canEat(int[] piles,int mid,int h)
    // {
    //       long hours = 0;
    //     for(int p:piles)
    //     {
    //         hours += (p + mid - 1)/mid;
    //     }
    //     return hours<=h;


public int minEatingSpeed(int[] piles, int h) {

    int low=1;
    int high=0;
     int ans=high;
    for(int i:piles)
    {
        high=Math.max(high,i);
    }

    while(low<=high)
    {
        int mid=low+(high-low)/2;
       
        if(canEat(piles,mid,h))
        {
            ans=mid;
            high=mid-1;

        }
        else
        {
            low=mid+1;
        }
    }

return ans;

    }

    public static boolean canEat(int[] piles,int mid, int h)
    { 
        long count=0;
       
        for(int i:piles)
        {
             int cal=i/mid;
            if(i%mid==0)
            {
               count+=cal;
            }
            else 
            {
                count=count+cal+1;
            }
        }
        if(count<=h) return true;

        return false;
    } 
}