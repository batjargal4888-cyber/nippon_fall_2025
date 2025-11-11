class JavaMethodsParameter {
    // Миний нэрийг хэвлэдэг printMyName гэдэг утга буцаадаггүй утга авдаггүй функц
    // бичээд өөрийнхөө нэрийг хэвлэнэ үү
    static void printMyName() {
        System.out.println("My name is Batja.");
    }

    // function parameter
    static void printMyNameParameter(String name) {
        System.out.println("My name is " + name);
    }

    // many parameters
    static void calculateAreaRectangle(double width, double length) {
        double area = width * length;
        System.out.println("Rectangle Are is: " + area);
    }

    public static void main(String[] args) {
        System.out.println("Session 23 - Java Function Parameters and Arguments");
        printMyName();
        printMyName();
        printMyName();
        // function call
        // function argument
        printMyNameParameter("Turuu");
        printMyNameParameter("Batja");
        printMyNameParameter("Bayarkhuu");
        printMyNameParameter("Puujee");
        printMyNameParameter("Saruul");
        // function many arguments
        calculateAreaRectangle(10.5, 20.5);
        calculateAreaRectangle(5, 6);
    }
}
