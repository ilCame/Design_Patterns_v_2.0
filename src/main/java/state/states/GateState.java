package state.states;

public interface GateState {
    void enter();

    void pay();

    void payOk();

    void failed();
}
