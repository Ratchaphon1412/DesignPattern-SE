package th.ac.ku.Adapter;

import th.ac.ku.Interface.Quackable;
import th.ac.ku.Model.Pigeon;

public class PigeonAdapter implements Quackable {

    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
