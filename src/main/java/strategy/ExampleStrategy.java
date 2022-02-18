package strategy;

import strategy.ducks.Duck;
import strategy.flybehaviour.JetFlyBehaviour;
import strategy.flybehaviour.NormalFlyBehaviour;

public class ExampleStrategy {

    Duck duck = new Duck();

    public void strategy(String strategy){

         duck = selectStrategy(strategy);

         System.out.println(duck.getFlyBehaviour().Fly());

    }

    public Duck selectStrategy(String strategy) {
        Duck duck = new Duck();

        if(strategy.equalsIgnoreCase("jetduck"))
            duck.setFlyBehaviour(new JetFlyBehaviour());
        if(strategy.equalsIgnoreCase("normalduck"))
            duck.setFlyBehaviour(new NormalFlyBehaviour());

        return duck;
    }
}
