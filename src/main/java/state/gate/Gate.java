package state.gate;

import state.states.GateState;
import state.states.impl.ClosedGateState;

public class Gate {
    GateState gateState;

    public Gate() {
        this.gateState = new ClosedGateState(this);
    }

    public void changeGateState(GateState state){
        this.gateState = state;
    }

    public void enter(){this.gateState.enter();}

    public void pay(){this.gateState.pay();}

    public void payOk(){this.gateState.payOk();}

    public void failed(){this.gateState.failed();}

}
