
import java.util.Scanner;

public class SUpiercer0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int classRoom[] = new int[10];
        int loop = sc.nextInt();
        boolean tic = false;
        for (int i = 0; i < loop; i++) {
            int number = sc.nextInt();
            int ticket_class = number % 1000 / 100;
            if(ticket_class == 0){
                System.out.println("Wilkorn Only");
            }
            else if(ticket_class>4){
                System.out.println("No Permission");
                classRoom[ticket_class]++;
                tic = true;
            }else{
            classRoom[ticket_class]++;
            }
        }
        
                System.out.println("First Class " + classRoom[1]);
                System.out.println("Second Class " + classRoom[2]);
                System.out.println("Third Class " + classRoom[3]);
                System.out.println("The Tail " + classRoom[4]);
                if(tic){
                System.out.println("###########");
                System.out.println("Fake Tickets");}
                for(int i=1; i<classRoom.length; i++){
                    if(i<1 || i>4  && classRoom[i] > 0 )
                    System.out.println("Class "+i+" "+classRoom[i]);
                }

    }

}
