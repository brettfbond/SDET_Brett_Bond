package class20.HWclass20;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}
class Masters extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("To get a masters degree you need a bachelors degree");
    }
}
class DegreeTest {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Bachelors bachelors = new Bachelors();
        Masters masters = new Masters();

        degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}