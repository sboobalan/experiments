package org.example.observerpattern.observables;

import org.example.observerpattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class CartObservable implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String change;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
        System.out.println("Observer added");
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers");
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addItem() {
        this.change = "Item added";
        System.out.println("Item added to cart");
        notifyObservers();
    }

    public void removeItem() {
        this.change = "Item removed";
        System.out.println("Item removed from cart");
        notifyObservers();
    }

    public void checkout() {
        this.change = "Checkout completed";
        System.out.println("Checkout completed");
        notifyObservers();
    }

    @Override
    public String getChange() {
        return change;
    }

}
