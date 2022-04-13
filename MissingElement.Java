package DSAAssg1;

public class MissingElement {
    public static void main(String[] args) {
        int[] ar={1,2,4,5};
        int n=ar.length+1;
        int sumall=(n*(n+1))/2;
        int sumofarray=0;
        for(int i=0;i<n-1;i++){
            sumofarray=sumofarray+ar[i];
        }
        int missingnumber=sumall-sumofarray;
        System.out.println("missing element is : "+missingnumber);



    }
}
