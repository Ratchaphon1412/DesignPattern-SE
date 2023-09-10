package th.ac.ku.Factory;

import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.DuckCall;
import th.ac.ku.Model.MallardDuck;
import th.ac.ku.Model.RedHeadDuck;
import th.ac.ku.implement.QuackerCounter;
import th.ac.ku.implement.QuackerEcho;

public class EchoCountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackerEcho(new QuackerCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackerEcho(new QuackerCounter(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackerEcho(new QuackerCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackerEcho(new QuackerCounter(new DuckCall()));
    }
}
