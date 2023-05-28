package class22;

public class Chocolate {

    String name;
    String color;
    int numberOfIngredients;

    public Chocolate(String name, String color, int numberOfIngredients) {
        this.name = name;
        this.color = color;
        this.numberOfIngredients = numberOfIngredients;
    }
    void taste () {

        System.out.println("Chocolates are delicious");
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+numberOfIngredients);
    }

}
class darkChocolate extends Chocolate{

    public darkChocolate(String name, String color, int numberOfIngredients) {
        super(name, color, numberOfIngredients);
    }

    void taste (){

        System.out.println("Dark Chocolate is bitter sweet");
    }

    void texture(){
        System.out.println("Dark chocolate is silky texture");

    }

}

class whiteChocolate extends Chocolate{

    public whiteChocolate(String name, String color, int numberOfIngredients) {
        super(name, color, numberOfIngredients);
    }

    void taste (){

        System.out.println("White Chocolate is buttery sweet ");
    }

    void make(){
        System.out.println("White chocolate is NOT mde out of cocoa");

    }

}
class milkChocolate extends Chocolate {

    public milkChocolate(String name, String color, int numberOfIngredients) {
        super(name, color, numberOfIngredients);
    }

    void taste() {

        System.out.println("Milk Chocolate is milky taste ");
    }

}
class ChocolateTester {

    public static void main(String[] args) {

        Chocolate[] obj = {new darkChocolate("Lindt", "Dark Brown", 1),
                new whiteChocolate("Kinder Bueno", "White", 3),
                new milkChocolate("Cadbury", "Brown", 2)};

        for (Chocolate choco : obj) {
            //choco = new darkChocolate("Lindt", "Dark Brown", 1);
            if (choco instanceof darkChocolate) {
                ((darkChocolate) choco).texture();
            } else if (choco instanceof whiteChocolate) {
                ((whiteChocolate) choco).make();
            }
                choco.printInfo();
                choco.taste();
        }
    }


}