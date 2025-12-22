public class BattleShip extends Ship {
    double displacement;

    public BattleShip(String name, double displacement) {
        super(name);
        this.displacement = displacement;
    }

    @Override
    public boolean canDive() {
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println("Battleship is flowing");
        super.printInfo();
        System.out.println("Battle ship " + name + " is flowing. The displacement is: " + displacement);
    }

}
