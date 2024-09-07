import java.util.*;

public class Pattern {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
     
      System.out.println("row values");
      int i,j,k;
      int s = sc.nextInt();
      
      for (i=1;i<=s;i++){
          int num=s+1-i;
          for(k=1;k<=i;k++){
              System.out.print(" ");
          }
          for(j=1;j<=(s-i+1);j++){
              System.out.print("*");
              num--;
          }
          System.out.println();
      }
     
      
        
        
    }
}