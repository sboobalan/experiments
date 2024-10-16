package org.example.chainofresponsibility;

import org.example.chainofresponsibility.dispenser.AmountDispenser;
import org.example.chainofresponsibility.dispenser.FiveHundredDispenser;
import org.example.chainofresponsibility.dispenser.HundredDispenser;
import org.example.chainofresponsibility.dispenser.ThousandDispenser;

public class Main {

    public static void main(String[] args) {

        AmountDispenser dispenser = new ThousandDispenser(new FiveHundredDispenser(new HundredDispenser(null)));
        dispenser.validateAndDispense(2000);
        dispenser.validateAndDispense(2250);
        dispenser.validateAndDispense(5500);
        dispenser.validateAndDispense(5900);
    }
}
