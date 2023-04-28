
import java.util.Scanner;

public class BloodMoney {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int j = 0; j < loop; j++) {
            String str = sc.next();
            int index = str.indexOf("@");
            int money = str.indexOf("$");
            String name = str.substring(0, index);
            String last = str.substring(index + 1, money);
            String m = str.substring(money);

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) != '#') {
                    System.out.print(name.charAt(i));
                }
            }
            System.out.print(" ");
            for (int i = 0; i < last.length(); i++) {
                if (last.charAt(i) != '#') {
                    System.out.print(last.charAt(i));
                }
            }
            System.out.print(" ");
            System.out.println("[Blood Money " + m + "]");
        }
    }
}
