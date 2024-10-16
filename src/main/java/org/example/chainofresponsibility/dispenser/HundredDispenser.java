package org.example.chainofresponsibility.dispenser;

public class HundredDispenser extends AmountDispenserImpl {

    public HundredDispenser(AmountDispenser nextDispenser) {
        super(nextDispenser);
    }
}
