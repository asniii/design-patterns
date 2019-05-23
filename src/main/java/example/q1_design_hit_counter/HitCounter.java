package example.q1_design_hit_counter;

import java.util.ArrayList;
import java.util.List;

public class HitCounter {

    int size =0;
    int currentNode = 0;
    List<Integer> list = new ArrayList<>();

    public void hit(int hitTime){
        size++;
        list.add(hitTime);
    }

    public void getHits(int duration){
        while(list.get(size -1) - list.get(currentNode)>duration){
            currentNode++;
        }
        System.out.println(size-currentNode);
    }

}
