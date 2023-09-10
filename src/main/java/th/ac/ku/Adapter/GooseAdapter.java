package th.ac.ku.Adapter;

import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.Goose;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
       goose.honk();
       goose.honk();

    }
}
