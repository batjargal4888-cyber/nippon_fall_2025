class WeekArray {
    public static void main(String[] args) {
        String [] weeks = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        for (int i = 1; i < weeks.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd index week day is: " + weeks [i]);
            }
        }
    }
}
