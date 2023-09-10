package th.ac.ku;

import th.ac.ku.Adapter.GooseAdapter;
import th.ac.ku.Adapter.PigeonAdapter;
import th.ac.ku.Factory.AbstractDuckFactory;
import th.ac.ku.Factory.CountingEchoDuckFactory;
import th.ac.ku.Factory.DuckFactory;
import th.ac.ku.Factory.EchoCountingDuckFactory;
import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.*;
import th.ac.ku.implement.Flock;
import th.ac.ku.implement.QuackerCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        System.out.print("Normal Mode : ");
        simulator.simulate(new DuckFactory());

        System.out.print("Counting Duck Mode : ");
        simulator.simulate(new CountingEchoDuckFactory());

        System.out.print("Echo before Counting Duck Mode : ");
        simulator.simulate(new EchoCountingDuckFactory());

        System.out.print("Counting before Echo Duck Mode : ");
        simulator.simulate(new CountingEchoDuckFactory());

    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flockOfAllDucks = new Flock();
        flockOfAllDucks.add(mallardDuck);
        flockOfAllDucks.add(redHeadDuck);
        flockOfAllDucks.add(duckCall);
        flockOfAllDucks.add(rubberDuck);
        flockOfAllDucks.add(goose);
        flockOfAllDucks.add(pigeon);

        System.out.println("Duck Simulator");
        System.out.println();

        System.out.println("Mallard Duck");
        simulate(mallardDuck);

//        System.out.println();


        System.out.println("RedHead Duck");
        simulate(redHeadDuck);
//        System.out.println();

        System.out.println("Duck Call");
        simulate(duckCall);
//        System.out.println();

        System.out.println("Rubber Duck");
        simulate(rubberDuck);
//        System.out.println();

        System.out.println("Goose Goose Duck");
        simulate(goose);
//        System.out.println();

        System.out.println("Pigeon");
        simulate(pigeon);
//        System.out.println();

        System.out.println("Flock all of Duck");
        simulate(flockOfAllDucks);

        System.out.println("The ducks quacked with out flock count " + QuackerCounter.getQuacks() + " times");
        System.out.println();

    }

    void simulate(Quackable duck) {
        System.out.println("------------------------------------------");
        duck.quack();
        System.out.println("------------------------------------------");
    }
}



