public class VowelCounter {
    // Эгшгийн тоо буцаах function
    public static int countVowels(String text) {
        int count = 0;
        String lowerText = text.toLowerCase(); // Том үсгийг жижиг болгоно.
        for(int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count ++;
            }
        }
        return count;
    }
}
