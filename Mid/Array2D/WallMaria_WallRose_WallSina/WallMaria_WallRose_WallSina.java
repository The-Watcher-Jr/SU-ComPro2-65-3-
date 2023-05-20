
import java.util.Scanner;

public class WallMaria_WallRose_WallSina {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int rol = sc.nextInt();
        int size_wall = rol + (4 - 1) * 2;
        int wall[][] = new int[size_wall][size_wall];
        for (int i = 0; i < size_wall; i++) {
            for (int j = 0; j < size_wall; j++) {
                if (i == 0 || i == size_wall - 1
                        || j == 0 || j == size_wall - 1) { //Wall Maria
                    wall[i][j] = 3;
                } else if (i == 1 || i == size_wall - 2
                        || j == 1 || j == size_wall - 2) { //Wall Rose
                    wall[i][j] = 2;
                } else if (i == 2 || i == size_wall - 3
                        || j == 2 || j == size_wall - 3) {//Wall Sina
                    wall[i][j] = 1;
                }

            }
        }
        System.out.println("WALL MAP [" + (size_wall * size_wall) + "]");
        for (int i = 0; i < size_wall; i++) {
            for (int j = 0; j < size_wall; j++) {
                System.out.print(wall[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("WALL MAP [" + (size_wall * size_wall) + "]");
    }

}
