
import java.util.Scanner;

public class JuliusNovachrono {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int time = sc.nextInt();
        if (time == 0) {
            System.out.println(text);
        } else if (time > 0) {
            String str = text.substring(0, time);
            System.out.println(str);
        } else if (time < 0) {
            String temp = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                temp += text.charAt(i);
            }
            System.out.println(temp);
        }

    }

}
