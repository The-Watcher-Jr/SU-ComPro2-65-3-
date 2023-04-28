
import java.util.Scanner;

public class TheHighTable {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String new_str = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U' ){
                 new_str += str.charAt(i);
                   i+=4;
            }else{
                new_str += str.charAt(i);
            }
        }
//        System.out.println(str);
        System.out.println(new_str);
        
        
    }
    
}
