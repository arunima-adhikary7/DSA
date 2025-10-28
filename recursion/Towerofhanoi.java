public class Towerofhanoi {
    public static void towerofhanoi(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("move disk "+n+" from "+s+" to "+d);
            return;
        }
       towerofhanoi(n-1,s,d,h);
       System.out.println("move disk "+n+" from "+s+" to "+d);
       towerofhanoi(n-1, h, s, d);
    }
    public static void main(String args[])
    {
         towerofhanoi(3, "s","h", "d");
    }
    
}
