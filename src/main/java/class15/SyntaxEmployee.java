package class15;

public class SyntaxEmployee {

    String empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {

        SyntaxEmployee e1 = new SyntaxEmployee();
        SyntaxEmployee e2 = new SyntaxEmployee();
        e1.empID = "465465";
        e1.salary = 110000;
        e2.empID = "723485";
        e2.salary = 111000;
        System.out.println(e1.empID + ", $" + e1.salary + ", CEO: " + SyntaxEmployee.CEO);
        System.out.println(e2.empID + ", $" + e2.salary + ", CEO: " + SyntaxEmployee.CEO);

    }
}
