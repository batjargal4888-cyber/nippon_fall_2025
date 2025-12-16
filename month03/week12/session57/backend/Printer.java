public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public void print(String text, int times) {
        for(int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public void print(String text1, String text2) {
        System.out.println(text1 + " " + text2);
    }
}
