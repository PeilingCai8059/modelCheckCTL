package modelCheckCTL.model;

import java.util.*;

public class KripkeStructure {
    private List<String> atoms ;
    private List<State> states;
    private List<Transition> transistions ;

    //constructor
    public KripkeStructure() {
        this.atoms = new ArrayList<String>();
        this.states = new ArrayList<State>();
        this.transistions = new ArrayList<Transition>();

    }

    ...
}
