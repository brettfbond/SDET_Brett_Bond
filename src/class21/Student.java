package class21;

public class Student {
    void study() {
        System.out.println("Students study");
    }
    void sleep() {
        System.out.println("Students sleep");
    }
    void eat() {
        System.out.println("Students eat");
    }
}
class SyntaxStudent extends Student {
    @Override
    void study() {
        System.out.println("Syntax students study Java");
    }
    @Override
    void sleep() {
        System.out.println("Syntax students do not get much sleep");
    }
    @Override
    void eat() {
        System.out.println("Syntax students eat during breaks");
    }

}
class CollegeStudent extends Student {
    @Override
    void study() {
        System.out.println("College students study a lot");
    }
    @Override
    void sleep() {
        System.out.println("College students do not get much sleep");
    }
    @Override
    void eat() {
        System.out.println("College students eat in the dining hall");
    }
    void lives() {
        System.out.println("College students live in dorms");
    }

}
class SchoolStudent extends Student {
    void travels() {
        System.out.println("School students ride the bus to school");
    }

}
class StudentTester {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student : students) {
            if (student instanceof CollegeStudent) {
                ((CollegeStudent)student).lives();
            } else if (student instanceof SchoolStudent) {
                ((SchoolStudent)student).travels();
            }
            student.study();
            student.sleep();
            student.eat();
        }

    }
}