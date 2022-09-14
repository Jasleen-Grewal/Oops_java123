package OOPS.abstractExample;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }
    //Concrete method
    public String getColor(){
        return color;
    }
    //abstract methods
    protected abstract double area();
    public abstract String toString();
}
