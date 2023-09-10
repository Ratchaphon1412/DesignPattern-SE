package th.ac.ku.implement;

import th.ac.ku.Interface.Quackable;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers;

    public Flock(){
        quackers = new ArrayList<>();
    }


    public void add (Quackable duck){
        quackers.add(duck);
    }

    @Override
    public void quack() {
//        for(Quackable duck : quackers){
//            duck.quack();
//        }
        ListIterator iterator = quackers.listIterator();
        while (iterator.hasNext()){
            int index =  iterator.nextIndex();
            Quackable duck = (Quackable) iterator.next();
            if(index == 0){
              System.out.println("Leader");
              System.out.println("...");
              duck.quack();
              duck.quack();
              duck.quack();
              System.out.println("...");
            }else{
                duck.quack();
            }


        }
    }
}
