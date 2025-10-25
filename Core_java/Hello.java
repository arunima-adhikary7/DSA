package Core_java;
import java.util.*;
public class Hello {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        //System.out.println("celcious :");
        //float c=sc.nextFloat();
        //float f=(c*9/5)+32;
        //System.out.println("fahrenheit is "+f);

        //ascii value
        char ch='a';
        int ascii=(int)ch;
        System.out.println("ascii value is "+ascii);

        //even or odd checking
        System.out.println("Take a number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }



    }
    
}
