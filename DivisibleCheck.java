import java.util.Scanner;
class DivisibleCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number is divisible by 7 :");
        int first =sc.nextInt();
        System.out.println("Enter a second number is divisible by 5:");
        int second=sc.nextInt();
         if (first % 7==0 && second %5==0)
        {
             int diff = first-second;
             System.out.println("the Difference is :"+diff);
        }
         else
             System.out.println("The user are enter wrong values do not divisible by 7 and 5 ");
          }
}