public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + " Java deer code bichij baina.");
    }

}
