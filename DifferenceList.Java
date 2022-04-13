package DSAAssg1;

import java.util.ArrayList;
import java.util.List;

public class differenceList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list 1 elements " +list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list 1 elements " +list2);
        list1.removeAll(list2);
        System.out.println("after fining diffrence " +list1);




    }
}
