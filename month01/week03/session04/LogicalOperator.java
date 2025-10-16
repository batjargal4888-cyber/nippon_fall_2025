class LogicalOperator {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        // Boolean Logical Operatoe
        // Logical Operator
        System.out.println("a and b: " + (a && b));
        System.out.println("a or b: " + (a || b));
        System.out.println("a is not b: " + (a != b));
        System.out.println("a is b: " + (a == b));

        // AND Logical Operator
        System.out.println("false and false " + (false && false));
        System.out.println("false and true " + (false && true));
        System.out.println("true and false " + (true && false));
        System.out.println("true and true " + (true && true));

        // OR Logical Operator
        System.out.println("false or false " + (false || false));
        System.out.println("false or true " + (false || true));
        System.out.println("true or false " + (true || false));
        System.out.println("true or true " + (true || true));

        // NOT Logical Operator
        System.out.println("not false " + !false);
        System.out.println("not true " + !true);

    }
}
