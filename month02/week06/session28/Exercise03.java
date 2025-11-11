public class Exercise03 {
    
    // 1-ээс limit хүртэл бүх тооны нийлбэрийг буцаадаг функц
    public int sumUpTo(int limit) {
        int sum = 0; // нийлбэрийг хадгалах хувьсагч
        for(int i = 1; i <= limit; i++) {
            sum += i; // i-г нийлбэрт нэмэх
        }
        return sum; // нийлбэрийг буцаах
    }

}
