package modelCheckCTL.model;

public class Transition {
    private String transitionName;
    private State fromState;
    private State toState;

    public Transition(){
    }

    public Transition(State fromState, State toState)  {
        this.transitionName = "";
        this.fromState = fromState;
        this.toState = toState;
    }

    public Transition(String transitionName, State fromState, State toState){
        this.transitionName = transitionName;
        this.fromState = fromState;
        this.toState = toState;
    }

    public String getTransitionName() {
        return transitionName;
    }

    public void setTransitionName(String tName) {
        transitionName = tName;
    }

    public void setFromState(State sName) {
        fromState = sName;
    }

    public State getFromState() {
        return fromState;
    }

    public void setToState(State sName) {
        toState = sName;
    }

    public State getToState() {
        return toState;
    }

    @Override
    public boolean equals(Object obj) {
        Transition input = (Transition) obj;
        return input.getFromState().equals(this.fromState) && input.getToState().equals(this.toState);
    }
}
