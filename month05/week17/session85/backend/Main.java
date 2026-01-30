public class Main {
    public static void main(String[] args) {
        // Calculator calculator = new Calculator();

        Cat egyptianCat = new Cat("male", "egyptian", "Pharaoh", 12);
        Turtle seaTurtle = new Turtle("female", "swimming", "Kuzma", 50);

        egyptianCat.gettingOld();
        egyptianCat.jump();
        egyptianCat.swim();

        seaTurtle.gettingOld();
        seaTurtle.jump();
        seaTurtle.swim();

        Triangle triangle = new Triangle();
        System.out.println(triangle.isTurnable());
        System.out.println(triangle.isPaintable());

        Circle circle = new Circle();
        System.out.println(circle.isTurnable());
        System.out.println(circle.isPaintable());

        // new interfacee
        Calculable calculable = new Calculable() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // lambda expression - iluu towch!
        Calculable add = (a, b) -> a + b;
        Calculable subtract = (a, b) -> a - b;
        Calculable multiply = (a, b) -> a * b;
        Calculable divide = (a, b) -> a / b;

        System.out.println(add.calculate(3, 5));
        System.out.println(subtract.calculate(3, 5));
        System.out.println(multiply.calculate(3, 5));
        System.out.println(divide.calculate(3, 5));
    }
}
