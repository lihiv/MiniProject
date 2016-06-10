package com.example.user.miniproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/06/2016.
 */
public class Riddles {
    private List<Riddle> riddles;

    public Riddles(){
        riddles=new ArrayList<Riddle>();
        riddles.add(new Riddle("1,2,3,4,?", "5"));
        riddles.add(new Riddle("1,3,5,7,?", "9"));
        riddles.add(new Riddle("0,2,4,6,?", "8"));
        riddles.add(new Riddle("1,1,1,1,?", "1"));
        riddles.add(new Riddle("3,6,3,6,?", "3"));
    }

    public Riddle getRiddleAt(int i){
        return riddles.get(i);
    }
}
