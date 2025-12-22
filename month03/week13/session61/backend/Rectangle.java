public class Rectangle implements Drawable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Tegsh untsugt zurj baina (" + width + "x" + height + ")");
    }
}
