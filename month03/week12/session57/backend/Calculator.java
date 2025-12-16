public class Calculator {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    // method overload
    public void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + d);
    }

    // method overload with double
    public void add(double a, double b) {
        double c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
