

public class Task1 {
    public static void main(String[] args){
     int m = 10;
     int total = 10;
     for(int i = 2; i < 8; i++){
         m = m * 10/100 + m;
         total += m;
     }
      System.out.print(total);

    }
}
