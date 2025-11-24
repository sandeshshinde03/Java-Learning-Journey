public class Employee {

    public String name;
    private double salary;
    protected String department;

    // Constructor
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter & Setter for private variable
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }

    // Method overloading: bonus calculation
    public double calculateBonus() {
        return salary * 0.10;
    }

    public double calculateBonus(double percent) {
        return salary * (percent / 100);
    }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Amit", 50000, "IT");
        emp.displayDetails();

        System.out.println("Default Bonus: " + emp.calculateBonus());
        System.out.println("Custom Bonus (20%): " + emp.calculateBonus(20));
    }
}
