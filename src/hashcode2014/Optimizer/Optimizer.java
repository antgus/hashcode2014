package hashcode2014.Optimizer;

public class Optimizer {
    Scorer scorer;
    Validator validator;
    TerminationCriteria terminator;
    
    public Optimizer setScorer(Scorer scorer) {
        this.scorer = scorer;
        return this;
    }
    
    public Optimizer setValidator(Validator validator) {
        this.validator = validator;
        return this;
    }

    // an optimizer is the component responsible for finding the best scoring state (local optima)
    public void addBaseActions() {
        // These are the base actions that the environment provides
    }
    
    public void addCompoundActions() {
        // TODO -- does it even make sense to differentiate these?
        // is it possible for the optimizer to infer which actions are redundant? Yes.
        // Because redundancy relates to score - if having action a and b doesn't improve things compared
        // to having just action a, or just action b, then those are redundant.
    }
    
    public void optimizeUntil(TerminationCriteria terminator) {
        while(!terminator.hasEnded()) {
            Action a = strategy.getNextAction();
            s.apply(a);
            scorer.update();
        }
    }
    
    public void optimizeFor(int durationInMs) {
        throw new RuntimeException("TODO"); // call optimizeUntil using a time limit termination
        //this.optimizeUntil();
    }
}
