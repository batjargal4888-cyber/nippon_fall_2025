@FunctionalInterface
public interface Calculable {
    int calculate(int a, int b); // single abstract method

    default void printResult(int result) {
        System.out.println("Ur dun: " + result);
    }

    static void info() {
        System.out.println("Calculator interface");
    }
}
