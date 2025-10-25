
public class Triangle {

    public static void main(String[] args) {
        int a=5,b=7,c=10;
        if(a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");
        }
    }
    
}
