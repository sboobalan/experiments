package org.example.chainofresponsibility.dispenser;

public class FiveHundredDispenser extends AmountDispenserImpl {

    public FiveHundredDispenser(AmountDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 500) {
            int num = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + num + " 500 note");
            if (remainder != 0) {
                nextDispenser.dispense(remainder);
            }
        } else {
            nextDispenser.dispense(amount);
        }
    }
}
