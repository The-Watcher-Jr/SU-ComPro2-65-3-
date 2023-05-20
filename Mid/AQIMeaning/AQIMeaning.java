import java.util.Scanner;
public class AQIMeaning {
  static void aqimeaning(int aqi){
    if((aqi>=0)&&(aqi<=50))
      System.out.println("Good");
    else if((aqi>=51)&&(aqi<=100))
      System.out.println("Moderate");
    else if((aqi>=101)&&(aqi<=150))
      System.out.println("Unhealthy for Sensitive Groups");
    else if((aqi>=151)&&(aqi<=200))
      System.out.println("Unhealthy");
    else if((aqi>=201)&&(aqi<=300))
      System.out.println("Very Unhealthy");
    else if(aqi>=301)      
      System.out.println("Hazardous");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int air = sc.nextInt();
    aqimeaning(air);
  }
}