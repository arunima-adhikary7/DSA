class Solution {
    public int maxScore(int[] c, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxsum;
        int n=c.length-1;
        

        for(int i=0;i<k;i++)
        {
            leftsum+=c[i];
        }
       for(int i=c.length-1; i>=c.length-k; i--)
{
    rightsum += c[i];
}
        maxsum=Math.max(leftsum,rightsum);
        int m=maxsum;
        for (int i = k - 1; i >= 0; i--) {
        {
        leftsum=leftsum-c[i]+c[n];
        m=Math.max(m,leftsum);
        n--;

        }

    }
        return m;

}
}