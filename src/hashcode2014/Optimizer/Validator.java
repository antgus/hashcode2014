package hashcode2014.Optimizer;

public interface Validator<State extends IState> {
    public boolean isValid(State s);
}
