package OOPS.abstractExample;

public  class  Circle extends Shape{
    protected double radius;
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle Constructor called");
        this.radius= radius;
    }
    @Override
    public double area(){
        return 3.14d*radius*radius;
    }

    @Override
    public String toString(){
        return "Circle color is "+super.color+" and area is:"+ area();
    }
}
