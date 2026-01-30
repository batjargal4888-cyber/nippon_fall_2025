public class Triangle extends Shape implements Turnable {
    private double height;
    private double base;

    public void calculateArea() {
        double area = height * base / 2;
        System.out.println("Triangle Area: " + area);
    }

    public void calculatePerimeter() {
        double side = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
        double perimeter = base + 2 * side;
        System.out.println("Triangle Perimeter: " + perimeter);
    }

    @Override
    public boolean isPaintable() {
        return true;
    }

    @Override
    public boolean isTurnable() {
        return false;
    }
}
