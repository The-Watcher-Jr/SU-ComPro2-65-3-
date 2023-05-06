
import java.util.Scanner;

public class RyomenSukuna {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int box[] = new int[size + 1];
        int box_size[] = new int[size + 1];
        int box_magic[] = new int[size + 1];
        int box_magic_size[] = new int[size + 1];
        int sukuna_R = 0;
        int sukuna_L = 0;
        int sukunafig = 0;
        int jubutsu = 0;
        int out_sukuna = 0;
        for (int i = 1; i <= size; i++) {
            box_size[i] = sc.nextInt();
        }
        for (int i = 1; i <= size; i++) {
            box_magic_size[i] = sc.nextInt();
        }
        for (;;) {
            int magic = sc.nextInt();
            if (magic < 1) {
                break;
            }
            int number = sc.nextInt();
            if (magic >= 100 && magic < 1000 && sukunafig < 20) {
                int num1 = magic / 100;
                int num2 = magic / 10 % 10;
                int num3 = magic % 10;
//                System.out.println(num1);
//                System.out.println(num2);
//                System.out.println(num3);
                int sum = num1 + num2 + num3;
//                System.out.println(sum);
                if (sum >= 10) {
                    int n1 = sum / 10;
                    int n2 = sum % 10;
//                    System.out.println(n1);
//                    System.out.println(n2);
                    sum = n1 + n2;
                }
//                System.out.println(sum);
                if (sum % 2 == 0) {
                    sukuna_R++;
                } else {
                    sukuna_L++;
                }
                sukunafig++;

                if (number > 0
                        && number <= size
                        && box[number] < box_size[number]
                        && box_magic_size[number] >= (box_magic[number] + magic)) {
                    box[number]++;
                    box_magic[number] += magic;
                    System.out.println("KO !");

                } else {
                    out_sukuna++;
                    System.out.println("SUKUNA !");
                }

            } else {
                jubutsu++;
                System.out.println("JUBUTSU !");
            }

        }

        for (int i = 1; i <= size; i++) {
            System.out.println(i + " " + box[i]+" "+box_magic[i]);
        }
        System.out.println("Sukuna's right finger "+sukuna_R);
        System.out.println("Sukuna's left finger "+sukuna_L);
        System.out.println("Sukuna's finger "+sukunafig);
        System.out.println("jubutsu "+jubutsu);
    }

}
