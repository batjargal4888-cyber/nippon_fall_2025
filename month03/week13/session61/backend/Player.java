public class Player implements Drawable, Movable, Resizable {
    private String name;
    private int x, y;
    private double size;

    public Player(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.size = 1.0;
    }

    @Override
    public void draw() {
        System.out.println(name + " zuragdaj baina (" + x + ", " + y + ")");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " shiljlee (" + x + ", " + y + ")");
    }

    @Override
    public void resizable(double factor) {
        this.size *= factor;
        System.out.println(name + " hemjee uurchlugdluu: " + size);
    }
    
}
