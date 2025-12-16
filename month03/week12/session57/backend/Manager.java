public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + " bagaa udirdaj baina.");
    }

}
