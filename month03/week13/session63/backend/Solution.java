public class Solution {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // arithmetic exception! program zogsono
            System.out.println("Ur dun: " + result); // ene mur ajillahgui
        } catch (ArithmeticException e) {
            System.out.println("Aldaa: Tegd huwaah bolomjgui!");
        }
        System.out.println("Program urgeljilj baina. . ."); // ene mur ajillana!
    }
}
