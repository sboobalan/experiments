package org.example.chainofresponsibility.dispenser;

public interface AmountDispenser {

    void validateAndDispense(int amount);
    void dispense(int amount);
}
