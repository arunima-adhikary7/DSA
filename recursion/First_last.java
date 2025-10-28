public class First_last {

   public static int first=-1;
   public static int last=-1;
    public static void firstandlastocurr(String str,int inx,char element)
    {
     
       if(inx==str.length())
       {
        System.out.println(first);
        System.out.println(last);
        return;
       }
        char currchar=str.charAt(inx);
        if(currchar==element)
        {
            if(first==-1)
            {
                first=inx;

            }
            else{
                last=inx;
            }
        }
     firstandlastocurr(str, inx+1, element);

    }
    public static void main(String[] args) {
        firstandlastocurr("aabccddefghaaa", 0, 'a');
        
    }
    
}
