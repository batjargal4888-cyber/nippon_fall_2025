public class Calculator01 {
    // 1-ээс n хүртэлх тооны нийлбэрийг буцаах функц
    public int sumUpTo(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
