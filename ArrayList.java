package DSAAssg1;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(17);
        System.out.println(list);
        list.set(3,18);
        System.out.println("after changing the 3rd position : "+list);
        List<String> names=new ArrayList<>();
        names.add("ayesha");
        names.add("tabassum");
        names.add("akram");
        names.add("akku");
        System.out.println(names);
       names.set(3,"mohd");
       System.out.println("after changing the rd position " +names);

    }
}
