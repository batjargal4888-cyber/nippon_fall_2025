public class Triangle implements Drawable {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Gurwaljin zurj baina (base=" + base + ", height=" + height + ")");
    }
}
