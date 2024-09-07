import java.util.Scanner;
class CheckDivisible2and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int d =sc.nextInt();
        
        if ((d % 2 == 0) && (d % 3 == 0))

        {
             System.out.println("The Number is Even");
         }
        
         else{
             
             System.out.println("The Number is odd");
         }
    }
}