public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void displayInfo() {
        System.out.println("Ungu: " + color);
        System.out.println("Talbai: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
