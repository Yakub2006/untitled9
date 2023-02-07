import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int b = in.nextInt();
        int a = in.nextInt();
       int result = 0;
        for(int i = 1; i <= b; i++){

            result += a;
        }
        System.out.println(result);
    }
}
