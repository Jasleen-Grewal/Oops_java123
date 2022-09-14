package OOPS.abstractExample;

public class BaseTest {
    public static void main(String[] args) {
        Shape circle = new Circle("Red",4.5);
        Shape rectangle = new Rectangle("Green ", 6,7);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
