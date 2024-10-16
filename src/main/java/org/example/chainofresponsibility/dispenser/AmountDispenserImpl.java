package org.example.chainofresponsibility.dispenser;

public class AmountDispenserImpl implements AmountDispenser {

    protected AmountDispenser nextDispenser;

    public AmountDispenserImpl(AmountDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void validateAndDispense(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
        } else {
            dispense(amount);
        }
    }

    @Override
    public void dispense(int amount) {
        if (amount < 100 || amount % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
            return;
        }
        int num = amount / 100;
        int remainder = amount % 100;
        System.out.println("Dispensing " + num + " 100 note");
        if (remainder != 0) {
            System.out.println("Something went wrong! Pending amount present! ");
        }

    }

}
