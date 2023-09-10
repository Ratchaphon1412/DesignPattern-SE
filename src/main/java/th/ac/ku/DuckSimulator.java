package th.ac.ku;

import th.ac.ku.Adapter.GooseAdapter;
import th.ac.ku.Adapter.PigeonAdapter;
import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.*;
import th.ac.ku.implement.QuackerCounter;
import th.ac.ku.implement.QuackerEcho;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackerEcho(new QuackerCounter (new MallardDuck()));
        Quackable redHeadDuck = new QuackerCounter(new RedHeadDuck());
        Quackable duckCall = new QuackerCounter(new DuckCall());
        Quackable rubberDuck = new QuackerCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("The ducks quacked " + QuackerCounter.getQuacks() + " times");

    }

    void simulate(Quackable duck) {

        duck.quack();
    }
}



