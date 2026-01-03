import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Charlie", 78));
        students.add(new Student(101, "Alice", 85));
        students.add(new Student(102, "Bob", 90));

        System.out.println("Before Sorting:");
        students.forEach(System.out::println);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getMarks() - s1.getMarks(); // Sort by marks descending
            }
        });

        System.out.println("\nAfter Sorting by Marks (Descending):");
        students.forEach(System.out::println);
    }
}
