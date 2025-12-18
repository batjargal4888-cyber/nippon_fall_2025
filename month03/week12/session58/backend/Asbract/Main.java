public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 15.5, 14.5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getPerimeter());
        rectangle.displayInfo();
        System.out.println("--------------");
        Circle circle = new Circle("Blue", 14.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(circle.getPerimeter());
        circle.displayInfo();
    }
}
