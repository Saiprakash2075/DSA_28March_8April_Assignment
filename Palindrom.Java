package DSAAssg1;

public class Palindram {
    public static void main(String[] args) {
        int[] a={1,2,3,3,2,1};
        int start=0;
        boolean flag=false;
        int end=a.length-1;
        while(start<end){
            if(a[start]==a[end]){
                flag=true;
                start++;
                end--;
            }
            

        }
        if(flag==true){
            System.out.println("polindram");
        }
        else{
            System.out.println("not polindram");

        }

    }
}
