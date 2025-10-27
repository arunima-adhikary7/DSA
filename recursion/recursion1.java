public class recursion1 {
//print n to 1
  public static void printnumber(int n)
  {
    if(n==0)
    {
        return;
    }
    System.out.println(n);
    printnumber(n-1);
  }
  //print 1 to 5 
  public static void frontprint(int n)
  {
    if(n==6)
    {
        return;
    }
    System.out.println(n);
    frontprint(n+1);
  }
//sum of first n natural numbers
 public static void sumoffirstnaturalnumbers(int n,int sum)

 {
   if(n==10)
   {
        System.out.println(sum);
    return;
   }
    sum+=n;
    sumoffirstnaturalnumbers(n+1, sum);
 }
//print factorial
 public static void factorial(int n,int fact)
 {
    if(n==0)
    {
        System.out.println(fact);
        return;
    }
    fact*=n;
    factorial(n-1, fact);
 }
//print fibonacci sequence
 public static void fibonacci(int a,int b,int n)
 {  
    if(n==11)
    {
        return;
    }
   
     int c=a+b;
    System.out.println(c);

    fibonacci(b, c,n+1);

 }

//x to the power n(with stack height=n)

 public static int printpower(int x,int n)
 {
    if(x==0)
    {
        return 0;
    }
    if(n==0)
    {
        return 1;
    }
    int x_=printpower(x,n-1);
    int xn=x*x_;
    return xn;

 }
//x to the power n(with stack height=logn)
  public static int printpower2(int x,int n)
 {
  
    if(n==0)
    {
        return 1;
    }
    if(n%2==0)
    {
    return printpower2(x,n/2)*printpower(x,n/2);
    }
    else
    return printpower2(x,n/2)*printpower(x,n/2)*x;

 }

    public static void main(String args[])
    {
        int n=5;
        printnumber(5);
        frontprint(1);
       sumoffirstnaturalnumbers(0, 0);
        factorial(5, 1);
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(0, 1, 0);

       System.out.println( printpower(2, 5));
       System.out.println( printpower2(2, 4));

    }
    
}
