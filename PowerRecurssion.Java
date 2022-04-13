package DSAAssg1;
import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the base number");
        int base=s.nextInt();
        System.out.println("enter the expnentinal of number");
        int exp=s.nextInt();
        FindPower(base,exp);
    }

    private static void FindPower(int base, int exp) {
        if(exp==1){
            //System.out.println(base);
            return;
        }
        else{
            int power=base*exp;

            FindPower(base,exp-1);
            System.out.print(power);
        }
    }
}
