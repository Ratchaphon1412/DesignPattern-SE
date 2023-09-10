package th.ac.ku.Factory;

import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.DuckCall;
import th.ac.ku.Model.MallardDuck;
import th.ac.ku.Model.RedHeadDuck;
import th.ac.ku.Model.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
