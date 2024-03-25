package bob.athangtraining.basicjava;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        float dist = sc.nextInt();
        System.out.println("Enter the time in seconds: ");
        float seconds = sc.nextInt();
        System.out.println("Enter the time in minutes: ");
        float mins = sc.nextInt();
        System.out.println("Enter the time in hours: ");
        float hours = sc.nextInt();
        Question6 q = new Question6();
        q.speedCalc(dist,seconds,mins,hours);
    }
    private static void speedCalc (float dist, float seconds, float mins, float hours){
        float speedmps = dist/seconds;
        float speedinkmph = (dist/1000)/hours;
        float speedinMph = (dist/1609)/hours;
        System.out.println("The speed in m/s is "+ speedmps);
        System.out.println("The speed in km/h is "+ speedinkmph);
        System.out.println("The speed in mile/h is "+ speedinMph);
    }
}
