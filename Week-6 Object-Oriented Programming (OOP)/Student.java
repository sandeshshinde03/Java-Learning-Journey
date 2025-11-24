public class Student {
    private String name;
    private int age;
    private double grade;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
    }

    // Parameterized constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 88.5);
        s1.display();

        Student s2 = new Student();
        s2.setName("Emma");
        s2.setAge(19);
        s2.setGrade(91.2);
        s2.display();
    }
}
