package DSAAssg1;

import java.util.ArrayList;
import java.util.List;

public class listCopy {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        System.out.println("list1 elements  " +list1);
        System.out.println("list2 elements  " +list2);
        list1.addAll(list2);
        System.out.println("after cpying elements  " +list1);



    }
}
