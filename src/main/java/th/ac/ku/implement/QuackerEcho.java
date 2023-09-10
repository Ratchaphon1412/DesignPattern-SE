package th.ac.ku.implement;

import th.ac.ku.Interface.Quackable;

public class QuackerEcho implements Quackable {
    private Quackable duck;



    public QuackerEcho(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo :");
        duck.quack();
    }
}
