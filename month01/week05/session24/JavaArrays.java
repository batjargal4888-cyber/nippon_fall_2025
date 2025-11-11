class JavaArrays {
    public static void main(String[] args) {
        System.out.println("Java Arrays");
        // problem
        // 100 uur turliin utgatai huwisagch uusgene uu
        // solution
        // olon utguudiig 1 huwisagchid hadgalj boloh container
        // -iig array gedeg
        int [] month_days; // int utga hadgaldaj array
        month_days = new int [12];
        System.out.println(month_days);
        // [ 31, 28, 31, 30, ... ]
        month_days [0] = 31;
        month_days [1] = 28;
        month_days [2] = 31;
        month_days [3] = 30;
        month_days [4] = 31;
        month_days [5] = 30;
        month_days [6] = 31;
        month_days [7] = 31;
        month_days [8] = 30;
        month_days [9] = 31;
        month_days [10] = 30;
        month_days [11] = 31;
        System.out.println("April has " + month_days [3] + " days");
    }
}
