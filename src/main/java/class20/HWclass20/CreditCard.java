package class20.HWclass20;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void getInterestPayment() {
        System.out.println("Your interest charge is " + (balance * interest));
    }
}
class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }
    @Override
    void getInterestPayment() {
        System.out.println("Your AX interest charge is " + (balance * interest));
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(20000, .19);
        Visa visa = new Visa(10000, .24);
        AX ax = new AX(500, .29);

        creditCard.getInterestPayment();
        visa.getInterestPayment();
        ax.getInterestPayment();
    }
}