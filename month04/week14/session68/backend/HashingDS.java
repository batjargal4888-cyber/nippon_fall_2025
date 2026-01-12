import java.util.HashMap;
import java.util.Map;

public class HashingDS {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Batja", 85);
        studentScores.put("Turuu", 86);
        studentScores.put("Bayarkhuu", 87);

        System.out.println(studentScores.get("Bayarkhuu"));
        
        System.out.println(studentScores);

        // Batja hun ali hediin baigaa gehdee bi dahij shineer nemehgui gej
        // bodii
        studentScores.putIfAbsent("Batja", 90);
        System.out.println(studentScores);

        studentScores.put("Batja", 90);
        System.out.println(studentScores);

        studentScores.put("Khangai", 50);
        System.out.println(studentScores);

        studentScores.remove("Khangai");
        System.out.println(studentScores);

        // Turuu gedeg tulhuu baina uu gej asuuy. 
        System.out.println(studentScores.containsKey("Turuu")); // true

        System.out.println(studentScores.containsKey("Khangai")); // false

        System.out.println(studentScores.containsValue(50)); // false
        System.out.println(studentScores.containsValue(90)); // true

        // Only keys
        System.out.println(studentScores.keySet());
        // only values
        System.out.println(studentScores.values());

        System.out.println("Keyset");
        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            System.out.println(name + ": " + score);
        }

        System.out.println("Entry set");
        for(Map.Entry<String,Integer> entry: studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name = ": " + score);
        }

        System.out.println("Total Point");
        int sum = 0;
        for (int score : studentScores.values()) {
            sum += score;
        }
        System.out.println("Student total grade is " + sum);
        System.out.println("Student average grade is " + sum / studentScores.size());
    }
}