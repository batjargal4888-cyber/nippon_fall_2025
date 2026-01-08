import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NotesManager {

    private static final String FILE_NAME = "notes.txt";

    // 1. Тэмдэглэл нэмэх
    public void addNote(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            writer.write(text);
            writer.newLine();
            System.out.println("✅ Тэмдэглэл хадгалагдлаа!");

        } catch (IOException e) {
            System.out.println("❌ Алдаа: " + e.getMessage());
        }
    }

    // 2. Бүгдийг харах
    public void showAll() {
        ArrayList<String> notes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            int index = 1;
            System.out.println("📋 Бүх тэмдэглэлүүд:");
            while ((line = reader.readLine()) != null) {
                System.out.println(index + ". " + line);
                notes.add(line);
                index++;
            }

            if (notes.isEmpty()) {
                System.out.println("📭 Тэмдэглэл байхгүй");
            }
            
        } catch (IOException e) {
            System.out.println("📭 Тэмдэглэлтэй Файл байхгүй");
        }
    }

    // 3. Хайх
    public void search(String keyword) {
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("🔍 Олдсон:");
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("- " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("❌ Олдсонгүй");
            }
        } catch (IOException e) {
            System.out.println("❌ Файл олдсонгүй");
        }
    }

    // 4. Устгах
    public void delete(int deleteIndex) {
        ArrayList<String> notes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }

        } catch (IOException e) {
            System.out.println("❌ Файл олдсонгүй");
            return;
        }

        if (deleteIndex < 1 || deleteIndex > notes.size()) {
            System.out.println("❌ Буруу дугаар");
            return;
        }

        notes.remove(deleteIndex - 1);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            
            for (String note : notes) {
                writer.write(note);
                writer.newLine();
            }

            System.out.println("🗑️ Устгагдлаа!");

        } catch (Exception e) {
            System.out.println("❌ Алдаа: " + e.getMessage());
        }
    }

    // 5. Тоо харах
    public void count() {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            
            while (reader.readLine() != null) {
                count++;
            }

            System.out.println("📊 Нийт тэмдэглэл: " + count);

        } catch (IOException e) {
            System.out.println("📊 Нийт тэмдэглэл: 0");
        }
    }

}
