
import java.util.Scanner;

public class SUpiercer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size % 2 != 0) {
            if ((size - 1) % 4 == 0) {
                int su[] = new int[5];
                int f = sc.nextInt();
                int s = sc.nextInt();
                int t = sc.nextInt();
                for (;;) {
                    int ticket = sc.nextInt();
                    if (ticket >= 10000) {
                        int inClass = sc.nextInt();
                        int in = ticket % 1000 / 100;
                        if (inClass >= in && inClass <= 4) {
                            if (inClass == 0) {
                                su[inClass]++;
                            } else if (inClass == 1 && su[1] < f) {
                                su[inClass]++;
                            } else if (inClass == 2 && su[2] < s) {
                                su[inClass]++;
                            } else if (inClass == 3 && su[3] < t) {
                                su[inClass]++;
                            } else {
                                su[4]++;
                            }
                        } else {
                            su[4]++;
                        }
                    } else {
                        System.out.println("Ticket END");

                        for (int i = 0; i < su.length; i++) {
                            System.out.println(i + " " + su[i]);
                        }
                        break;
                    }

                }
            } else {
                System.out.println("Wilkorn Industries Rejected");
            }

        } else {
            System.out.println("Engineers Rejected");
        }
    }

}
