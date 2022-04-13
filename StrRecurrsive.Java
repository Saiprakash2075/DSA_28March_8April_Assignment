package DSAAssg1;

public class StrRrcurcive {
    public static void main(String[] args) {
        String str="hello";
        RevString( str);
    }
    public static void RevString(String str){
        if(str.length()==0){
            return;
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            RevString(str.substring(0,str.length()-1));
        }

    }
}
