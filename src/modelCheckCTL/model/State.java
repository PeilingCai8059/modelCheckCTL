package modelCheckCTL.model;

import java.util.*;

public class State {
    //attributes
    private List<String> atoms;
    private String stateName;

    public State() {
        atoms = new ArrayList<String>();
    }

    public State(String stateName) {
        this();
        this.stateName = stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName.trim();
    }

    public void setAtoms(List<String> atoms) {
        this.atoms = atoms;
    }

    public List<String> getAtoms() {
        return atoms;
    }

    @Override
    public boolean equals(Object obj) {
        return this.stateName.equals(((State) obj).getStateName());
    }
}
