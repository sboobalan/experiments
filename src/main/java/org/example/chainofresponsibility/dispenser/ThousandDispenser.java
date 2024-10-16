package org.example.chainofresponsibility.dispenser;

public class ThousandDispenser extends AmountDispenserImpl {

    public ThousandDispenser(AmountDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 1000) {
            int num = amount / 1000;
            int remainder = amount % 1000;
            System.out.println("Dispensing " + num + " 1000 note");
            if (remainder != 0) {
                nextDispenser.dispense(remainder);
            }
        } else {
            nextDispenser.dispense(amount);
        }
    }
}
