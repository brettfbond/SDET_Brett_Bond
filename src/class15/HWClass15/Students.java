package class15.HWClass15;

public class Students {

    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    private String name;
    private String id;

    public static void main(String[] args) {

        int numberOfStudents = 0;
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        s1.name = "Brett";
        s1.id = "12";
        numberOfStudents++;
        s2.name = "Vlad";
        s2.id = "17";
        numberOfStudents++;
        s3.name = "Yulia";
        s3.id = "11";
        numberOfStudents++;
        System.out.println(numberOfStudents);



    }
}
