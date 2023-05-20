
import java.util.Scanner;

public class Asta {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reader = sc.nextLine();
        String str = sc.nextLine();
        if (name.equalsIgnoreCase("asta") || reader.equalsIgnoreCase("asta")) {
            String str_new = "";
            for (int i = 0; i < str.length(); i++) {
                int c = (int) str.charAt(i) + 1;
                str_new += (char) c;
            }
            System.out.println(str_new);
        } else if (name.equalsIgnoreCase(reader)) {
            System.out.println(str);
        } else {
            String str_new = "";
            for (int i = 0; i < str.length(); i++) {
                int c = (int) str.charAt(i) - 1;
                str_new += (char) c;
            }
            System.out.println(str_new);
        }

    }

}
