package class25.HWclass25;

import java.util.ArrayList;
import java.util.List;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {

    String insuranceName;
    public abstract double getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance {
    String carModel;

    @Override
    public double getQuote() {
        return 600;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your car insurance is cancelled");
    }
}
class Pet extends Insurance {

    String petType;

    @Override
    public double getQuote() {
        return 120;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your pet insurance is cancelled");
    }
}

class Health extends Insurance {

    @Override
    public double getQuote() {
        return 350;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Your health insurance is cancelled");
    }
}

class InsuranceTester {
    public static void main(String[] args) {

        List<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car());
        insurances.add(new Pet());
        insurances.add(new Health());
        System.out.println(insurances);

        for (Insurance insurance : insurances) {
            System.out.println("Your premium is $" + insurance.getQuote());
            insurance.cancelInsurance();
        }
    }
}