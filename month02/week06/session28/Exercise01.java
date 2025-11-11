public class Exercise01 {
    public String checkSign(int number) {
        if (number > 0) {
            return "Эерэг";
        } else if (number < 0) {
            return "Сөрөг";
        } else {
            return "Тэг";
        }
    }
}