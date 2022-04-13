package DSAAssg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> sort=new ArrayList<>();
        sort.add(5);
        sort.add(7);
        sort.add(6);
        sort.add(8);
        sort.add(17);
        sort.add(16);
        sort.add(18);
        sort.add(9);
        System.out.println("befoer sorting " +sort);
        Collections.sort(sort, Collections.reverseOrder());
        System.out.println("after sorting the array in decresing order : " +sort);
    }
}
