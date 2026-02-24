public class Warrior extends Character implements Attackable {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " илдээр довтолж байна!");
    }
}