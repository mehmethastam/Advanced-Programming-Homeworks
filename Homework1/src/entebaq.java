import java.util.Scanner;
public class entebaq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour,minute;
        String a ;
        a = scanner.next();
        hour = Integer.parseInt(a.substring(0, 2));
        minute = Integer.parseInt(a.substring(3));
        int counter = hour;

        double theta = ((hour%12)*30 - minute * 5.5) %360;

        if(hour > 12){
            counter-- ;
        }
        if( theta <= 0 ){
            counter ++;
        }
        if(hour == 12 && minute == 0){
            counter = 12;
        }
        System.out.println(counter);
        scanner.close();
    }
}
