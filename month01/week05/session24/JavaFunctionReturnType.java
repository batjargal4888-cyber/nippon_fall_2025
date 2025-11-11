class JavaFunctionReturnType {

    static void printSomething() {
        System.out.println("This is function with no return value and parameters");
    }

    static void printSomethingSomething(int something) {
        System.out.println("This is function with no return value with parameter: " + something);
    }

    // return type
    static int addTwoNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    // exercise 01
    // 3 double утгыг параметрээр авч үржвэрийг нь буцаадаг
    // multiplyThreeNumbers гэдэг function бичнэ үү.

    static double multiplyThreeNumbers(double a, double b, double c) {
        double result = a * b * c;
        return result;
    }

    // exercise 02
    // hello, world гэдэг 2 string төрөлтэй параметр авдаг concatHelloWorld гэдэг
    // function бичээд энэ 2 parameter concentration буцаадаг function бичнэ үү.

    static String concatHelloWorld(String hello, String world) {
        return hello + world;
    }

    public static void main(String[] args) {
        System.out.println("Java Function Return Type");
        printSomething();
        printSomethingSomething(10);
        int result00 = addTwoNumbers(22, 5);
        System.out.println(result00);
        double result01 = multiplyThreeNumbers(3, 5, 6);
        System.out.println(result01);
        String result02 = concatHelloWorld("hello", "world");
        System.out.println(result02);

        
    }
}