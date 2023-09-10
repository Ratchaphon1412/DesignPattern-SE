package th.ac.ku.Factory;

import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.DuckCall;
import th.ac.ku.Model.MallardDuck;
import th.ac.ku.Model.RedHeadDuck;
import th.ac.ku.Model.RubberDuck;
import th.ac.ku.implement.QuackerCounter;
import th.ac.ku.implement.QuackerEcho;

public class CountingEchoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackerCounter(new QuackerEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackerCounter(new QuackerEcho( new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackerCounter(new QuackerEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackerCounter(new QuackerEcho(new RubberDuck()));
    }
}
