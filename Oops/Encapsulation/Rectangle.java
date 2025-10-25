package Oops.Encapsulation;

public class Rectangle {
    
    private double height,width;
    public Rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }
    public double calculateArea()
    {
        return height*width;
    }
    public static void main(String args[])
    {
        Rectangle rec=new Rectangle(5,3);
        System.out.println("Area of Rectangle: "+rec.calculateArea());
    }
}
