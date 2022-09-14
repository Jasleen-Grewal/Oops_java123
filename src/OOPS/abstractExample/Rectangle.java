package OOPS.abstractExample;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color, double length,double width){
        super(color);
        System.out.println("Rectangle Constructor called");
        this.length=length;
        this.width=width;
    }
    @Override
    public double area(){
        return length*width;
    }
    @Override
    public String toString(){
        return "Color of Rectangle is "+super.color+" Area of Rectangle is: "+area();
    }
}
