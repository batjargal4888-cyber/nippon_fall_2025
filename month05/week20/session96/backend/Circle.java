public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("Би тойрог байна, радиус: " + radius);
    }

    public void describe(String color) {
        System.out.println("Би " + color + " өнгийн тойрог байна.");
    }
}
