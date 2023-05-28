package class25.HWclass25;

import java.util.HashSet;

/*
Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
 */
public class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Jill", 587));
        students.add(new Student("Jacob", 457));
        students.add(new Student("Joel", 235));

        students.forEach(s -> System.out.println(s.getName()));
    }
}
