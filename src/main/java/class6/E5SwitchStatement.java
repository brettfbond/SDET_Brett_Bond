package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender = 'F';

        switch (gender) {
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Mail");
                break;
            case 'O':
                System.out.println("Other");
                break;
            default:
                System.out.println("Letter not supported");
        }
    }
}
