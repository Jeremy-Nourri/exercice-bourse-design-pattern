package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Investisseur investisseurChristophe = Investisseur.builder().nom("Christophe").build();
        Investisseur investisseurGuillaume = Investisseur.builder().nom("Guillaume").build();

        Action totalAction = Action.builder().name("TOTAL").price(100D).observers(new ArrayList<>()).build();
        totalAction.registerObserver(investisseurChristophe);
        totalAction.registerObserver(investisseurGuillaume);

        Action lorealAction = Action.builder().name("LOREAL").price(70D).observers(new ArrayList<>()).build();
        lorealAction.registerObserver(investisseurChristophe);
        lorealAction.registerObserver(investisseurGuillaume);

        List<Action> actions = new ArrayList<>();

        actions.add(totalAction);
        actions.add(lorealAction);

    }
}