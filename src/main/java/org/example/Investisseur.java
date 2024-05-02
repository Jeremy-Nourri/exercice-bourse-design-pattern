package org.example;

import lombok.Builder;

@Builder
public class Investisseur implements Observer<Action> {

    String nom;

    @Override
    public void update(Action element) {
        System.out.println("The price has changed  " + element.getPrice());
    }
}
