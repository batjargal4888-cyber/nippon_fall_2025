class Gradebook {

    // 2. Print all grades
    public static void printAllGrades(String[] names, int[] scores) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }

    // 3. Calculate average
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int s : scores) sum += s;
        return (double) sum / scores.length;
    }

    // 4. Pass/Fail status (ternary)
    public static String getPassStatus(int score) {
        return (score >= 60) ? "Pass" : "Fail";
    }

    // 5. Find student score
    public static int findStudentScore(String[] names, int[] scores, String targetName) {
        for (int i = 0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(targetName)) {
                return scores[i];
            }
        }
        return -1;
    }

    // 6. Find pairs that meet a target sum
    public static void findScorePairs(String[] names, int[] scores, int targetSum) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; i++) {
                if (scores[i] + scores[j] == targetSum) {
                    System.out.println("Хос олдлоо: " + names[i] + " (" + scores[i] + ") ба " + names[j] + " (" + scores[j] + ")");
                }
            }
        }
    }

    // 1. Data
    public static void main(String[] args) {
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] studentScores = {85, 92, 78, 95, 88};

        // Функцүүдээ энд дууд...
        printAllGrades(studentNames, studentScores);
        System.out.println("Average: " + calculateAverage(studentScores));

        for (int score : studentScores) {
            System.out.println(score + " -> " + getPassStatus(score));
        }

        System.out.println("Charlie's score: " + findStudentScore(studentNames, studentScores, "Charlie"));

        findScorePairs(studentNames, studentScores, 180);
    }
}