import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student batja = new Student("Batja", 85);
        Student turuu = new Student("Turuu", 86);
        Student bayarkhuu = new Student("Bayarkhuu", 87);

        ArrayList<Student> nipponStudents = new ArrayList<>();
        nipponStudents.add(batja);
        nipponStudents.add(turuu);
        nipponStudents.add(bayarkhuu);

        int maxGrade = 0;
        Student maxStudent = null;
        for (Student student : nipponStudents) {
            if (maxGrade < student.getGrade()) {
                maxGrade = student.getGrade();
                maxStudent = student;
            }
        }

        if (maxStudent != null) {
            System.out.println(maxStudent.getName() + " " + maxStudent.getGrade());
        }
        // 1ms condition 1,000,000 ugugdul bailaa. Hamgiin muudaa hamgiin undur onootoi oyutan
        // hamgiin suuld baina gej bodii. Her ih hugatsaa zartsuulah we?
        // 1 ms * 1,000,000 = 1,000,000 ms = 16.6 minutes
    }
}
