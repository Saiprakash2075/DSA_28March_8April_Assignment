package DSAAssg1;

import java.util.Arrays;

public class MajorityElements {
    public static void main(String[] args) {
       // int[] a={2,2,1,1,2,2};
        int[] a={3,2,3};
        int count1=0;
        int count2=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count1>count2){
            System.out.println(a[0]);
        }
        else{
            System.out.println(a[a.length-1]);
        }
    }
}
