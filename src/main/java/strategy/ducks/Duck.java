package strategy.ducks;

import strategy.flybehaviour.FlyBehaviour;

public class Duck {

    private FlyBehaviour flyBehaviour;
    
    
    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    
}
