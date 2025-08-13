
class Employee {
    String name;
    int age;
    double salary;
    String batch;

    // Constructor
    public Employee(String name, int age, double salary, String batch) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.batch = batch;
    }

    // Method to display basic employee info
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Batch: " + batch);
    }
}

// Manager inherits Employee
class Manager extends Employee {
    String department;
    int teamSize;

    // Manager constructor calls Employee constructor using super()
    public Manager(String name, int age, double salary, String batch, String department, int teamSize) {
        super(name, age, salary, batch); // Inheritance avoids repetition
        this.department = department;
        this.teamSize = teamSize;
    }

    // Additional method for Manager
    public void displayManagerDetails() {
        // Call parent method to avoid repeating code
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        // Create an Employee
        Employee emp = new Employee("John Doe", 28, 55000, "Batch A");
        System.out.println("=== Employee Details ===");
        emp.displayDetails();

        System.out.println();

        // Create a Manager
        Manager mgr = new Manager("Alice Smith", 35, 85000, "Batch B", "IT Department", 10);
        System.out.println("=== Manager Details ===");
        mgr.displayManagerDetails();
    }
}
