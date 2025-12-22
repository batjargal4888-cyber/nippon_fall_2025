public class Uboot extends Ship {
    double length;

    public Uboot(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canDive() {
        return true;
    }

    @Override
    public void printInfo() {
        System.out.println("UBoot is sinking");
        super.printInfo();
        System.out.println("UBoot length is: " + length + " m.");
    }

}
