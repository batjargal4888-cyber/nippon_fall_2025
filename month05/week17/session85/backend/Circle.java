public class Circle extends Shape implements Turnable {
    private double radius;
    private double PI = 3.14;

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Circle Perimeter: " + perimeter);
    }

    @Override
    public boolean isPaintable() {
        return true;
    }

    @Override
    public boolean isTurnable() {
        return true;
    }
}
