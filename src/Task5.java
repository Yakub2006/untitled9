import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       double d = 2.54;
       double x = 0;
       for(int i = 1;i <= 20;i++){
        x += d;
        System.out.println(i + "-->" + x);
       }
    }
}
