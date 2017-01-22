package hashcode2014;

import hashcode2014.Optimizer.Validator;

public class MyValidator implements Validator<State> {
    private int timeLimit;
    
    @Override
    public boolean isValid(State s) {
        return s.routes.stream().noneMatch((r) -> (r.getTotalDuration() > timeLimit));
    }

}
