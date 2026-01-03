import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice", 85));
        students.add(new Student(102, "Bob", 90));
        students.add(new Student(103, "Charlie", 78));

        System.out.println("Using enhanced for-each loop:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
