import java.util.Scanner;
public class Pattern40{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int k=1;k<=(n-i+1);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
            for(int i=1;i<=n;i++){
                for(int k=1;k<=i;k++){
                System.out.print(" ");
                }
                for(int j=1;j<=(n-i+1);j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        
    }
}