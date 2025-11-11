class Recapture {
    public static void main(String[] args) {
        int [] myNumbers = {
            1, 4, 5, 6, 8
        };
        System.out.println(myNumbers[1]);

        // 1 * 4 * 5 * 6 * 8 = 960
        int summe = 1;

        for (int i = 0; i < myNumbers.length; i++) {
            summe = summe * myNumbers [i];
        }
        System.out.println(summe);
        String output = "";
        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers.length - 1 > i) {
                output = output + myNumbers [i] + "*";
            } else {
                output = output + myNumbers [i] + "*";
            }
        }
        output = output + summe;
        System.out.println(output);
    }
}