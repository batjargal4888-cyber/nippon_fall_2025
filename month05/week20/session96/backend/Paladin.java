public class Paladin extends Character implements Attackable, Healable {
    public Paladin(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " илдээр довтолж байна!");
    }

    @Override
    public void heal() {
        System.out.println(name + " эмчилгээ хийж байна!");
    }
}
