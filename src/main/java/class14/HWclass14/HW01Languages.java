package class14.HWclass14;

public class HW01Languages {

    // Create a method that will say Hello in different language based on the country that will passed when method is executed.

    void sayHello(String language) {
        switch (language) {
            case "English" :
                System.out.println("Hello");
                break;
            case "French" :
                System.out.println("Bonjour");
                break;
            case "Spanish" :
                System.out.println("Hola");
                break;
            case "Turkish" :
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Language not recognized");
        }
    }

    public static void main(String[] args) {

        HW01Languages obj = new HW01Languages();
        obj.sayHello("Australian");
    }
}
