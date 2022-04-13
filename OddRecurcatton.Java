package DSAAssg1;

public class OddRecurcattion {
    public static void main(String[] args) {
        int n=31;
        int i=1;
        Odd(n,i);
    }

    private static void Odd(int n, int i) {
        if(i==n){
            System.out.println(i);
            return;
        }
        else{
            System.out.println(i);
            Odd(n,i+2);
        }
    }
}
