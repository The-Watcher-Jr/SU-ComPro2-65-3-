
import java.util.Scanner;

public class TheContinental {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String str = sc.next();
            if (str.equals("X")) {
                break;
            }
            if (str.equalsIgnoreCase("theadjudicator")) {
                System.out.println("Welcome, The Adjudicator");
                break;
            }
            if(str.indexOf("Un#")>=0){
                int s = str.indexOf("#");
                int e = str.lastIndexOf("#");
                int m =  str.indexOf("$");
                String name = str.substring(s+1, e);
                String last = str.substring(e+1,m);
                String money = str.substring(m);
                System.out.println("Welcome, "+name+"  "+last+" ["+money+"]");
            }
           else if(str.indexOf("Hit#")>=0){
                int s = str.indexOf("#");
                int e = str.lastIndexOf("#");
                int m =  str.indexOf("$");
                String name = str.substring(s+1, e);
                String last = str.substring(e+1,m);
                String money = str.substring(m);
                System.out.println("Welcome home, "+name+"  "+last+" ["+money+"]");
            
            } else {
               int t = 0;
               int h = 0;
               if(str.length()<=12){
                   for(int i=0; i<str.length(); i++){
                       if(str.charAt(i)=='T'){
                           t++;
                       }
                       if(str.charAt(i)=='H'){
                           h++;
                       }
                   }if (t == 2 && h == 1) {
                       System.out.println("Welcome, The High Table");
                   } else {
                       System.out.println("Welcome, Unknown");
                   }
               }else{
                   System.out.println("Welcome, Unknown");
               }
               
           }
        }
    }

}
