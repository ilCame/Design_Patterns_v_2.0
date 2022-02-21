package state.states.impl;

import state.gate.Gate;
import state.states.GateState;

public class ClosedGateState implements GateState {
    Gate gate;

    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        this.gate.changeGateState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {
        this.gate.changeGateState(new ProcessGateState(this.gate));
    }

    @Override
    public void payOk() {
        this.gate.changeGateState(new ClosedGateState(this.gate));
    }

    @Override
    public void failed() {
        this.gate.changeGateState(new ClosedGateState(this.gate));
    }
}
