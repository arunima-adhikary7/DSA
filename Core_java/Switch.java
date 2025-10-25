package Core_java;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        System.out.println("Enter operator(+,-,*,/)");
        char op=sc.next().charAt(0);
        double result;
        switch (op) {

            case '+': 
               result=a+b;
                break;
            case '-': 
                result=a-b;
                break;
            case '*' :
                result=a*b;
                break;
            case '/' : 
                result=a/b;
                break;
            case '%' :
                result=a%b;
                break;
            default:
               System.out.println("invalid operator");
               return;

        }
        System.out.println("Result:"+result);
    }
    
}
