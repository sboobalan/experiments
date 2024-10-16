package org.example.observerpattern;

import org.example.observerpattern.observables.CartObservable;
import org.example.observerpattern.observers.EmailObserver;
import org.example.observerpattern.observers.InAppObserver;
import org.example.observerpattern.observers.MobileObserver;
import org.example.observerpattern.observers.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CartObservable cartObservable = new CartObservable();
        Observer mobileObserver = new MobileObserver(cartObservable);
        Observer emailObserver = new EmailObserver(cartObservable);

        cartObservable.addObserver(mobileObserver);
        cartObservable.addItem();

        cartObservable.addObserver(emailObserver);
        cartObservable.removeItem();

        Observer inAppObserver = new InAppObserver(cartObservable);
        cartObservable.removeObserver(mobileObserver);
        cartObservable.addObserver(inAppObserver);
        cartObservable.checkout();
    }
}