import java.util.Scanner;
class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number :");
        int first =sc.nextInt();
        System.out.println("Enter a second number :");
        int second=sc.nextInt();
        int sum=first+second;
        int diff=first-second;
        
        if (sum>diff)

        {
             System.out.println("The Number is Even");
         }
        
         else{
             
             System.out.println("The Number is odd");
         }
    }
}