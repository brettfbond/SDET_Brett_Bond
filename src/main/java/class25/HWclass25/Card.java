package class25.HWclass25;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    public static void main(String[] args) {

        List<Card> cards = new LinkedList<>();
        cards.add(new Card(19.99, "Visa"));
        cards.add(new Card(24.99, "MasterCard"));
        cards.add(new Card(29.99, "AmEx"));

        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card.getCardType());
            System.out.println(card.getInterestRate());
        }
    }

}
