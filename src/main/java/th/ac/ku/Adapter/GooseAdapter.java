package Adapter;

import Interface.Quackable;

public class GooseAdapter implements Quackable {
    

    public void quack() {
        System.out.println("Honk");
    }
}
