public abstract class Ship {
    String name;

    public Ship(String name) {
        this.name = name;
    }

    public abstract boolean canDive();

    public void printInfo() {
        System.out.println("Ship name is : " + this.name);
        System.out.println("Ship can dive: " + canDive());
    }
}
