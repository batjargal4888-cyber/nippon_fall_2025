public abstract class Shape {
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter - engiin method
    public String getColor() {
        return this.color;
    }

    // Abstract methoduud - huu class heregjuulne
    public abstract double getArea();
    public abstract double getPerimeter();

    // Engiin method - buh durst ijil
    public void displayInfo() {
        System.out.println("Dursnii medeelel:");
        System.out.println("    Ungu:" + color);
        System.out.println("    Talbai:" + getArea());
        System.out.println("    Perimeter:" + getPerimeter());
    }
}
