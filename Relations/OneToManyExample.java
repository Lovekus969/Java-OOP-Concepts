import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Teacher {
    String name;
    List<Student> students; // many students

    Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    String name;
    Teacher teacher; // one teacher

    Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}

public class OneToManyExample {
    public static void main(String[] args) {
        // Create teacher
        Teacher teacher = new Teacher("Mr. Smith");

        // Create students and assign teacher
        Student s1 = new Student("Alice", teacher);
        Student s2 = new Student("Bob", teacher);
        Student s3 = new Student("Charlie", teacher);

        // Add students to teacher
        teacher.addStudent(s1);
        teacher.addStudent(s2);
        teacher.addStudent(s3);

        // Output
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Students:");
        for (Student s : teacher.students) {
            System.out.println(" - " + s.name + " (Teacher: " + s.teacher.name + ")");
        }
    }
}
